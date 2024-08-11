package business.abstracts;

import entities.Animal;
import exceptions.TooMuchAnimals;

public interface EnclosureService {
    void addAnimal(Animal animal) throws TooMuchAnimals;
    void removeAnimal(Animal animal);
    int size();
}
