import animals.Elephant;
import animals.Lion;
import business.concretes.EnclosureManager;
import business.concretes.FoodStoreManager;
import business.concretes.ZooManager;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;
import zookeepers.Zookeeper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TooMuchAnimals, HasNoFood, NoAnimal {
        FoodStoreManager foodStore=new FoodStoreManager();
        foodStore.addFood("hay",1);
foodStore.takeFood("hay");
       // BigCat tiger=new Tiger();
        Lion lion=new Lion(12,'M',5,1);
        Elephant elephant=new Elephant(2,'F',6,13);
        EnclosureManager enclosureManager=new EnclosureManager();
        EnclosureManager enclosureManager2=new EnclosureManager();
EnclosureManager enclosureManagers[]={enclosureManager,enclosureManager2};
//enclosureManager.addAnimal(tiger);

        enclosureManager.addAnimal(elephant);
        enclosureManager.addAnimal(lion);

        System.out.println(enclosureManager.size());
       // tiger.eat(true);
        elephant.eat(true);
       // enclosureManager.aMonthPasses();
      //  enclosureManager.addWaste(20);
        System.out.println(enclosureManager.currentWaste());
        Zookeeper zookeeper=new Zookeeper("Nermin");
zookeeper.cleanWaste(enclosureManager,0);
        ZooManager zooManager=new ZooManager(enclosureManagers);
       // zooManager.readFile("C:\\Users\\user\\IdeaProjects\\FinalAssignment\\src\\writefile\\zoo.txt");

    }
}