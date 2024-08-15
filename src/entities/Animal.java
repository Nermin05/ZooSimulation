package entities;

public abstract class Animal {
  private   int age;
    private char gender;
    private String[] foods;
    private int health;
    private int lifeExpectancy;
    public Animal() {
    }

    public Animal(int age, char gender, String[] foods, int health, int lifeExpectancy) {
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

    public String[] getFoods() {
        return foods;
    }

    public abstract void setFoods(String[] foods);

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
for(String eat:foods) {
    if(eat.equalsIgnoreCase(meal)) {
        return true;
    }
}
        return false;

    }
    public boolean checkHealth() {
        return health < 10;
    }
    public  void eat(){

    }
    public void decreaseHealth() {
    }
    public abstract void treat();


    public abstract boolean aMonthPasses();

}
