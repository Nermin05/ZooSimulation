package business.abstracts;

import animals.Animal;
import enums.Foods;
import exceptions.HasNoFood;
import exceptions.NoAnimal;
import exceptions.TooMuchAnimals;

import java.util.List;

public interface EnclosureService {
    void addAnimal(Animal animal) throws TooMuchAnimals;
    void removeAnimal(Animal animal) throws NoAnimal;
    int size();
    void addWaste(int waste);
    int currentWaste() throws HasNoFood;
    void removeWaste(int waste);
    int getWasteSize();
    void aMonthPasses();
    void bringFoods(String name,int count);
    void displayEnclosures();
}
