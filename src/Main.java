import animals.Animal;
import animals.Elephant;
import animals.Tiger;
import business.concretes.EnclosureManager;
import business.concretes.FoodStoreManager;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TooMuchAnimals, HasNoFood, NoAnimal {
        FoodStoreManager foodStore=new FoodStoreManager();
        foodStore.addFood("hay",1);
foodStore.takeFood("hay");
        Tiger tiger=new Tiger();
        Elephant elephant=new Elephant();
        EnclosureManager enclosureManager=new EnclosureManager();
enclosureManager.addAnimal(tiger);

        enclosureManager.addAnimal(elephant);
        System.out.println(enclosureManager.size());
        tiger.eat(true);
        elephant.eat(false);
       // enclosureManager.currentWaste();
        enclosureManager.addWaste(5);
        enclosureManager.removeWaste(7);
        enclosureManager.aMonthPasses();
    }
}