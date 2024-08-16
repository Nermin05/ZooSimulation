package animals;

import enums.Foods;

public abstract class Animal {
  private   int age;
    private char gender;
    private Foods foods;
    private int health;
    private int lifeExpectancy;
    public Animal() {
    }

    public Animal(int age, char gender, Foods foods, int health, int lifeExpectancy) {
        this.age = age;
        this.gender = gender;
        this.foods = foods;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Foods getFoods() {
        return foods;
    }

    public abstract void setFoods(Foods foods);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int getLifeExpectancy();

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public boolean canEat(String meal) {
for(Foods eat:Foods.values()) {
    if(eat.name().equalsIgnoreCase(meal)) {
        return true;
    }
}
        return false;

    }
    public boolean checkHealth() {
        return health < 10;
    }
    public abstract  boolean eat(boolean ifEat);
    public void decreaseHealth() {

    }
    public abstract void treat();


    public abstract boolean aMonthPasses();

}
