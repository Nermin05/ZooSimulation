package business.abstracts;

import animals.Animal;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;

public interface EnclosureService {
    void addAnimal(Animal animal) throws TooMuchAnimals;
    void removeAnimal(Animal animal) throws NoAnimal;
    int size();
    void addWaste(int waste);
    void currentWaste() throws HasNoFood;
    void removeWaste(int waste);
    void aMonthPasses();
}
