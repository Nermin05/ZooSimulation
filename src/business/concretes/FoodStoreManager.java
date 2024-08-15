package business.concretes;

import business.abstracts.FoodStoreService;
import enums.Foods;

import java.util.HashMap;
import java.util.Map;

public class FoodStoreManager implements FoodStoreService {
    @Override
   public void addFood(String food,int count){
        boolean found=false;
        for(Foods food2:Foods.values()) {
            if (food2.name().equalsIgnoreCase(food)) {
                System.out.println(count + " dene " + food + " elave olundu!");
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("Bele bir yemek yoxdur!");
        }
   }

    @Override
    public void takeFood(String food) {
        boolean found=false;
        for (Foods food2 : Foods.values()) {
            if (food2.name().equalsIgnoreCase(food)) {
                System.out.println("Tapildi:"+food2.name());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bele bir yemek yoxdur!");
        }
    }
    }


