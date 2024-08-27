package business.concretes;

import animals.Animal;
import animals.BigCat;
import animals.Elephant;
import animals.Lion;
import business.abstracts.ZooService;
import enums.Foods;
import exceptions.HasNoFood;
import exceptions.TooMuchAnimals;
import zookeepers.Zookeeper;

import java.io.*;
import java.util.*;

public class ZooManager implements ZooService {
    EnclosureManager[] enclosureManagers;
    List<Zookeeper> zookeeperList;
    FoodStoreManager foodStoreManager;
    EnclosureManager enclosureManager;
   private int  enclosureCount;


    public ZooManager(EnclosureManager[] enclosureManagers) {
        this.enclosureManagers = enclosureManagers;
        zookeeperList = new ArrayList<>();
        foodStoreManager = new FoodStoreManager();
        enclosureCount=0;
        enclosureManager=new EnclosureManager();
    }

    @Override
    public void aMonthPasses() {
        for (EnclosureManager enclosure : enclosureManagers) {
            enclosure.aMonthPasses();
        }
        checkAnimalsHP();
        foodStoreManager.restock();
    }

    @Override
    public void checkAnimalsHP() {
        for (EnclosureManager enclosureManager : enclosureManagers) {
            for (Animal animal : enclosureManager.animalList) {
                if (animal.getHealth() == 0) {
                    enclosureManager.animalList.remove(animal);
                }
            }

        }
    }

    @Override
    public void go() {
        while (true) {
            aMonthPasses();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void writeFile(String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write("Zoo:\n");

            int enclosureCount = 1;

            for (EnclosureManager enclosureManager1 : enclosureManagers) {
                bufferedWriter.write("Enclosure " + enclosureCount + ":\n");
                enclosureCount++;

                List<Animal> animals = enclosureManager1.animalList;
                Set<String> uniqueAnimalTypes = new HashSet<>();

                for (Animal animal : animals) {
                    uniqueAnimalTypes.add(animal.getClass().getSimpleName());
                }
                for (String animalType : uniqueAnimalTypes) {
                    int count = 0;
                    for (Animal animal : animals) {
                        if (animal.getClass().getSimpleName().equals(animalType)) {
                            count++;
                        }
                    }
                    bufferedWriter.write("  Animal: " + animalType + " Count: " + count + "\n");
                }

                for (Map.Entry<String, Integer> foods : enclosureManager1.enclosureFoodStore.entrySet()) {
                    bufferedWriter.write("  Food: " + foods.getKey() + " Quantity: " + foods.getValue() + "\n");
                }
                List<Zookeeper> zookeepers = zookeeperList;
                Set<String> uniqueZookeepers = new HashSet<>();

                for (Zookeeper zookeeper : zookeepers) {
                    uniqueZookeepers.add(zookeeper.getClass().getSimpleName());
                }
                for (String zookeeper : uniqueZookeepers) {
                    int count = 0;
                    for (Zookeeper zookeeper1 : zookeepers) {
                        if (zookeeper1.getClass().getSimpleName().equals(zookeeper)) {
                            count++;
                        }
                    }
                    bufferedWriter.write("  Animal: " + zookeeper + " Count: " + count + "\n");
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addZookeeper(Zookeeper zookeeper) {
        zookeeperList.add(zookeeper);
    }


}



