package business.concretes;

import business.abstracts.EnclosureService;
import animals.Animal;
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
        return animalList.size();
    }

    @Override
    public void addWaste(int wasteNew) {
waste+=wasteNew;
        System.out.println("Current waste:"+wasteNew+" Total:"+waste);
    }

    @Override
    public void removeWaste(int wasteRemove) {
        if (waste>0 && waste>wasteRemove) {
            waste -= wasteRemove;
        }else {
            waste=0;
        }

    }

    @Override
    public void aMonthPasses() {
for(Animal animal:animalList) {
    animal.aMonthPasses();
}
    }

}
