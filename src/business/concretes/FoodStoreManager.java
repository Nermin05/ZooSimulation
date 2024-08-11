package business.concretes;

import business.abstracts.FoodStoreService;
import entities.Food;

import java.util.HashMap;
import java.util.Map;

public class FoodStoreManager implements FoodStoreService {
    public static Map<String, Food> foodMap=new HashMap<>();
    public static void foods() {
        foodMap.put("hay",new Food("hay", 1, 4));
        foodMap.put("steak",new Food("steak", 3, 4));
        foodMap.put("fruit",new Food("fruit", 2, 3));
        foodMap.put("celery",new Food("celery", 0, 1));
        foodMap.put("fish",new Food("fish", 3, 2));
        foodMap.put("ice cream",new Food("ice cream", 1, 3));

        for(String name:foodMap.keySet())
            System.out.println(foodMap.get(name));
    }
    @Override
   public void addFood(String food,int count){
if(foodMap.containsKey(food)) {
    System.out.println(count+" dene "+food+" elave olundu!");
}
else {
    System.out.println("Bele yemek yoxdur");
}
   }

    @Override
    public void takeFood(String food) {
        if(foodMap.containsKey(food)) {
            System.out.println(food+" alindi!");
        }
        else {
            System.out.println("Bele yemek yoxdur");
        }
    }
    }


