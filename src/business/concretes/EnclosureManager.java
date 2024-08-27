package business.concretes;

import business.abstracts.EnclosureService;
import animals.Animal;
import enums.Foods;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnclosureManager implements EnclosureService {
    List<Animal> animalList;
  private int waste=0;
  FoodStoreManager foodStoreManager;
  Map<String,Integer> enclosureFoodStore;
    public EnclosureManager() {
    animalList=new ArrayList<>();
    }

    public EnclosureManager(List<Animal> animalList, FoodStoreManager foodStore) {
        this.animalList=animalList;
        this.foodStoreManager=foodStore;
        this.waste=0;
        enclosureFoodStore=new HashMap<>();
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    @Override
    public void addAnimal(Animal animal) throws TooMuchAnimals {
        if(animalList.size()>20)  {
            throw new TooMuchAnimals("There is a lot of animals");
        }

        animalList.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) throws NoAnimal {
        if(!animalList.isEmpty()) {
            animalList.remove(animal);
        }
        else {
            throw new NoAnimal("There isn't any animal");
        }
    }

    @Override
    public int size() {
        System.out.print("Animals' count:");
        return animalList.size();
    }

    @Override
    public void addWaste(int wasteNew) {
        boolean animalEat=false;
        for(Animal animal:animalList) {
            if (animal.eat(true)) {
animalEat=true;
            }
        }
        if(animalEat) {
            waste+=wasteNew;
        }
        System.out.println("Waste:"+waste);
    }

    public int currentWaste() throws HasNoFood {
        int wasteNew = 0;
        boolean hasFood = false;
        for (Animal animal1 : animalList) {
            System.out.println("Processing animal: " + animal1);
            List<Foods> edibleFoods = animal1.edibleFoods();
            if (!edibleFoods.isEmpty()) {
                Foods food = edibleFoods.get(0);
                System.out.println("Animal has food: " + food);
                wasteNew += food.getWaste();
                hasFood = true;
            } else {
                throw new HasNoFood(animal1 + " has no food!");
            }
        }
        if (!hasFood) {
            throw new HasNoFood("No animals had food to process.");
        }
        waste += wasteNew;
        return waste;
    }



    @Override
    public void removeWaste(int wasteRemove) {
        if (waste>0 && waste>wasteRemove) {
            waste -= wasteRemove;
        }else {
            waste=0;
        }
        System.out.println("Current waste:"+waste);

    }

    @Override
    public int getWasteSize() {
        return waste;
    }

    @Override
    public void aMonthPasses() {
for(Animal animal:animalList) {
    animal.aMonthPasses();
}
    }

    @Override
    public void bringFoods(String name,int count) {
       if(foodStoreManager.ifExist(name)) {
           enclosureFoodStore.put(name,count);
           System.out.println("There is "+count+" "+name);
       }
    }

    @Override
    public void displayEnclosures() {
        System.out.println("Animals in enclosure:");
        for(Animal animal:animalList) {
            System.out.println("There is "+animal+" in enclosure");
        }
        System.out.println("Foods in enclosure:");
        for(Map.Entry<String,Integer> food:enclosureFoodStore.entrySet()) {
            System.out.println("There is "+food.getValue()+" "+food.getKey());
        }
    }


}
