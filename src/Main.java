import business.concretes.FoodStoreManager;
import exceptions.TooMuchAnimals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TooMuchAnimals {
        FoodStoreManager foodStore=new FoodStoreManager();
        foodStore.addFood("hay",1);
foodStore.takeFood("hay");




    }
}