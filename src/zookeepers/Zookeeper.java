package zookeepers;

import animals.Animal;
import animals.Bear;
import animals.BigCat;
import business.concretes.EnclosureManager;
import business.concretes.FoodStoreManager;
import enums.Foods;
import exceptions.HasNoFood;
import exceptions.TooMuchFoods;
import java.util.List;

public class Zookeeper {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zookeeper(String name) {
        this.name = name;
    }

   public void cleanWaste(EnclosureManager foodEnclosure,int count) throws HasNoFood {
       int currentWaste = foodEnclosure.currentWaste();
      if(currentWaste>count) {
          System.out.print("Cleaned:");
          System.out.println(currentWaste-count);
          foodEnclosure.setWaste(currentWaste-count);
      }
      else {
          System.out.println(currentWaste);
          foodEnclosure.setWaste(0);
      }
    }
  public void giveTreat(List<Animal> animals) {
        int give=0;
for(Animal animal:animals) {
    if(give>=2)  break;
if(animal instanceof BigCat){
    ((BigCat) animal).stroked();
    give++;
}
if(animal instanceof Bear) {
    ((Bear) animal).hug();
    give++;
}

}
    }
}
