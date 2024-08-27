package animals;

import enums.Foods;

import java.util.ArrayList;
import java.util.List;

public class Bear extends Animal{
    public Bear(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
    }

    @Override
    public int getLifeExpectancy() {
        return 18;
    }

    @Override
    public boolean eat(boolean ifEat) {
        return ifEat;
    }

    public int hug() {
        if (checkHealth()) {
            setHealth(getHealth()+3);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public void treat() {
        if(hug()<10) System.out.println(getHealth()+2);
        else System.out.println(10);
    }

    @Override
    public List<Foods> edibleFoods() {
        List<Foods> edible = new ArrayList<>();
        if (canEat("STEAK")) {
            edible.add(Foods.STEAK);
        }
        if (canEat("FISH")) {
            edible.add(Foods.FISH);
        }
        return edible;
    }

    @Override
    public boolean aMonthPasses() {
        if (getHealth() < 3) {
            System.out.println("The bear is in poor health");
            return false;
        }
        System.out.println("The bear is excellent");
        return true;
    }

    @Override
    public String toString() {
        return "Bear";
    }
}

