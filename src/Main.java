import animals.*;
import business.abstracts.FoodStoreService;
import business.concretes.EnclosureManager;
import business.concretes.FoodStoreManager;
import business.concretes.ZooManager;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;
import zookeepers.PhysioZookeeper;
import zookeepers.PlayZooKeeper;
import zookeepers.Zookeeper;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TooMuchAnimals, HasNoFood, NoAnimal {
        FoodStoreManager foodStoreManager=new FoodStoreManager();
        foodStoreManager.addFood("hay",20);
        foodStoreManager.addFood("STEAK",15);
        foodStoreManager.displayFoodStore();
       // foodStoreManager.takeFood("hay",20);
        Bear bear=new Bear(5,'M',6,10);
        Bear bear2=new Bear(9,'M',8,9);
        List<Animal> animalList1=new ArrayList<>();
        animalList1.add(bear);
        animalList1.add(bear2);
        EnclosureManager enclosureManager=new EnclosureManager(animalList1,foodStoreManager);
        enclosureManager.bringFoods("hay",15);
        enclosureManager.displayEnclosures();
        Lion lion=new Lion(4,'F',9,10);
        Lion lion2=new Lion(2,'M',5,11);
        List<Animal> animalList2=new ArrayList<>();
        animalList2.add(lion);
        animalList2.add(lion2);
        FoodStoreManager foodStoreManager2=new FoodStoreManager();
        foodStoreManager2.addFood("celery",10);
        foodStoreManager2.addFood("fish",15);
        Gorilla gorilla=new Gorilla(3,'F',9,13);
        Gorilla gorilla2=new Gorilla(6,'F',7,12);
        EnclosureManager enclosureManager2=new EnclosureManager(animalList2,foodStoreManager2);
        enclosureManager2.bringFoods("celery",5);
        enclosureManager2.displayEnclosures();
        List<Animal> animalList3=new ArrayList<>();
        animalList3.add(gorilla);
        animalList3.add(gorilla2);
        FoodStoreManager foodStoreManager3=new FoodStoreManager();
        foodStoreManager3.addFood("ice_cream",10);
        foodStoreManager3.addFood("fruit",5);
        EnclosureManager enclosureManager3=new EnclosureManager(animalList3,foodStoreManager3);
        enclosureManager3.bringFoods("fruit",5);
        enclosureManager3.displayEnclosures();
        EnclosureManager[] enclosureManagers ={enclosureManager,enclosureManager2,enclosureManager3};
ZooManager zooManager=new ZooManager(enclosureManagers);
Zookeeper playZooKeeper=new PlayZooKeeper("Salam");
Zookeeper physioZookeeper=new PhysioZookeeper("Hi");
zooManager.addZookeeper(playZooKeeper);
        zooManager.addZookeeper(physioZookeeper);
        zooManager.writeFile("src\\writefile\\zoo.txt");

    }
}