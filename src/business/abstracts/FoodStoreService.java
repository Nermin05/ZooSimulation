package business.abstracts;

import exceptions.HasNoFood;

public interface FoodStoreService {
     void addFood(String food,int count) throws HasNoFood;
     void displayFoodStore();
     void takeFood(String food,int count) throws HasNoFood;
     boolean ifExist(String name);

}
