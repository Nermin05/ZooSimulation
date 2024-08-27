package business.concretes;

import business.abstracts.FoodStoreService;
import enums.Foods;
import exceptions.HasNoFood;

import java.util.*;

public class FoodStoreManager implements FoodStoreService {
    private HashMap<Foods,Integer> foodsHashMap;

    public FoodStoreManager() {
        this.foodsHashMap = new HashMap<>();
    }

    @Override
   public void addFood(String foodName,int count) throws HasNoFood {
        boolean found=false;
        for(Foods food:Foods.values()) {
            int currentCount=foodsHashMap.getOrDefault(food,0);
            if(food.name().equalsIgnoreCase(foodName) && count>0) {
                foodsHashMap.put(food,currentCount+count);
                found=true;
                break;
            }
        }
        if(!found) {
            throw new HasNoFood("There isn't any food");
        }
   }

    @Override
    public void displayFoodStore() {
        for(Map.Entry<Foods, Integer> food:foodsHashMap.entrySet()) {
            System.out.println("There is :"+food.getKey()+" count:"+food.getValue());
        }
    }

    @Override
    public void takeFood(String food,int count) throws HasNoFood {
        boolean found=false;
        for (Foods food2 : Foods.values()) {
            int currentCount=foodsHashMap.getOrDefault(food2,0);
            if (food2.name().equalsIgnoreCase(food)) {
                int result=currentCount-count;
                if (result<0) {
                    throw new HasNoFood("There isn't enough");
                }
                foodsHashMap.put(food2,result);
                System.out.println(count+" "+food2+" is taken ");
                System.out.println(result+" "+food2+" is left");
                found = true;
                break;
            }
        }
        if (!found) {
throw new HasNoFood("There isn't any food like that!");        }
    }
    public boolean ifExist(String name) {
        for(Map.Entry<Foods, Integer> food:foodsHashMap.entrySet()) {
            if (food.getKey().name().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public void restock() {
        List<Foods> foodsList=new ArrayList<>();
        foodsList.addAll(Arrays.asList(Foods.values()));
        System.out.println("Successfully updated!");
    }
    }


