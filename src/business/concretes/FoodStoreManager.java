package business.concretes;

import business.abstracts.FoodStoreService;
import enums.Foods;

import java.util.*;

public class FoodStoreManager implements FoodStoreService {
    @Override
   public void addFood(String food,int count){
        boolean found=false;
        for(Foods food2:Foods.values()) {
            if (food2.name().equalsIgnoreCase(food)) {
                System.out.println(count + " food added!");
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("There isn't any food like that!");
        }
   }

    @Override
    public void takeFood(String food) {
        boolean found=false;
        for (Foods food2 : Foods.values()) {
            if (food2.name().equalsIgnoreCase(food)) {
                System.out.println("Found:"+food2.name());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("There isn't any food like that!");
        }
    }
    public void restock() {
        List<Foods> foodsList=new ArrayList<>();
        foodsList.addAll(Arrays.asList(Foods.values()));
        System.out.println("Successfully updated!");
    }
    }


