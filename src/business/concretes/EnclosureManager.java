package business.concretes;

import business.abstracts.EnclosureService;
import animals.Animal;
import enums.Foods;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;

import java.util.ArrayList;
import java.util.List;

public class EnclosureManager implements EnclosureService {
    List<Animal> animalList;
    int waste=0;
    public EnclosureManager() {
    animalList=new ArrayList<>();
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

    @Override
    public void currentWaste() throws HasNoFood {
        int wasteNew=0;
        boolean hasFood=false;
        for(Animal animal1:animalList) {
            if(animal1.eat(true)) {
                Foods food=animal1.getFoods();
if(food!=null) {
    wasteNew += animal1.getFoods().getWaste();
    hasFood=true;
}else {
    throw new HasNoFood(animal1+" has no food!");
}
            }
        }
        if (!hasFood) {
            throw new HasNoFood("No animals had food to process.");
        }
        waste+=wasteNew;
        System.out.println("Current waste:"+waste);
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
    public void aMonthPasses() {
for(Animal animal:animalList) {
    animal.aMonthPasses();
}
    }

}
