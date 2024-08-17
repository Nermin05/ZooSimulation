package animals;

import enums.Foods;

import java.util.ArrayList;
import java.util.List;

public class Giraffe extends Animal{
    public Giraffe(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
    }

    @Override
    public int getLifeExpectancy() {
        return 28;
    }

    @Override
    public boolean eat(boolean ifEat) {
        return ifEat;
    }

    public int neckMessage() {
        if (checkHealth()) {
            setHealth(getHealth()+4);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public void treat() {
        if(neckMessage()<10) System.out.println(getHealth());
        else System.out.println(10);
    }

    @Override
    public List<Foods> edibleFoods() {
        List<Foods> edible = new ArrayList<>();
        if (canEat("HAY")) {
            edible.add(Foods.HAY);
        }
        if (canEat("FRUIT")) {
            edible.add(Foods.FRUIT);
        }
        return edible;    }

    @Override
    public boolean aMonthPasses() {
        if (getHealth() < 3) {
            System.out.println("The giraffe is in poor health");
            return false;
        }
        System.out.println("The giraffe is excellent");
        return true;
    }

    @Override
    public String toString() {
        return "Giraffe";
    }
}
