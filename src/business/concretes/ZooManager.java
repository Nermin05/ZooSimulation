package business.concretes;

import animals.Animal;
import animals.BigCat;
import animals.Elephant;
import animals.Lion;
import business.abstracts.ZooService;
import exceptions.TooMuchAnimals;
import zookeepers.Zookeeper;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public void readFile(String fileName) {//sehvlik var
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                if (line.startsWith("enclosure:")) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        try {
                            int waste = Integer.parseInt(parts[1].trim());
                            enclosureCount++;
                            System.out.println("Enclosure count: " + enclosureCount);
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid waste value: " + parts[1]);
                        }
                    }
                } else if (line.contains(":")) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String type = parts[0].trim();
                        try {
                            int quantity = Integer.parseInt(parts[1].trim());
                            foodStoreManager.addFood(type, quantity);
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid quantity value: " + parts[1]);
                        }
                    }
                } else if (line.contains(",")) {
                    String[] parts = line.split(",");
                    if (parts.length >= 4) {
                        try {
                            int age = Integer.parseInt(parts[0].trim());
                            char gender = parts[1].trim().charAt(0);
                            int health = Integer.parseInt(parts[2].trim());
                            int lifeExpectancy = Integer.parseInt(parts[3].trim());

                            String animalType = parts.length > 4 ? parts[4].trim() : "";
                            if (animalType.equalsIgnoreCase("lion")) {
                                enclosureManager.addAnimal(new Lion(age, gender, health, lifeExpectancy));
                            } else if (animalType.equalsIgnoreCase("elephant")) {
                                enclosureManager.addAnimal(new Elephant(age, gender, health, lifeExpectancy));
                            } else {
                                System.err.println("Unknown animal type: " + animalType);
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid animal data: " + line);
                        }
                    } else {
                        System.err.println("Malformed animal line: " + line);
                    }
                } else if (line.equalsIgnoreCase("playZookeeper")) {
                    // Add zookeeper processing here if needed
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("File not found or error reading file: " + e.getMessage(), e);
        } catch (TooMuchAnimals e) {
            throw new RuntimeException("Error with too many animals: " + e.getMessage(), e);
        }
    }

}



