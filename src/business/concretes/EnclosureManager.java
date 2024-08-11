package business.concretes;

import business.abstracts.AnimalService;
import business.abstracts.EnclosureService;
import entities.Animal;
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
    public void removeAnimal(Animal animal) {
        animalList.remove(animal);
    }

    @Override
    public int size() {
        return animalList.size();
    }
}
