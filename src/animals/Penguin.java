package animals;

import enums.Foods;

import java.util.ArrayList;
import java.util.List;

public class Penguin extends Animal{
    public Penguin(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
    }

    @Override
    public int getLifeExpectancy() {
        return 15;
    }

    @Override
    public boolean eat(boolean ifEat) {
        return ifEat;
    }

    public int watchAFilm() {
        if (checkHealth()) {
            setHealth(getHealth()+2);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public void treat() {
        if(watchAFilm()<10) System.out.println(getHealth()+2);
        else System.out.println(10);
    }

    @Override
    public List<Foods> edibleFoods() {
        List<Foods> edible = new ArrayList<>();
        if (canEat("FISH")) {
            edible.add(Foods.FISH);
        }
        if (canEat("ICE CREAM")) {
            edible.add(Foods.ICE_CREAM);
        }
        return edible;    }

    @Override
    public boolean aMonthPasses() {
        if (getHealth() < 4) {
            System.out.println("The penguin is in poor health");
            return false;
        }
        System.out.println("The penguin is excellent");
        return true;
    }

    @Override
    public String toString() {
        return "Penguin";
    }
}
