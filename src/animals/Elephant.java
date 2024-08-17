package animals;

import enums.Foods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elephant extends Animal{
    public Elephant(int age, char gender,int health,int lifeExpectancy) {
        super(age, gender,health,lifeExpectancy);
    }



    @Override
    public int getLifeExpectancy() {
        return 36;
    }

    @Override
    public boolean eat(boolean ifEat) {
        if (ifEat) {
            if (canEat("HAY")) {
                setFoods(Collections.singletonList(Foods.HAY));
                return true;
            } else if (canEat("FRUIT")) {
                setFoods(Collections.singletonList(Foods.FRUIT));
                return true;
            }
        }
        return false;
    }

    public int bath() {
        if (checkHealth()) {
            setHealth(getHealth()+5);
        }
        return 10;
    }

    @Override
    public void treat() {
       if(bath()<10) System.out.println(getHealth());
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
        return edible;
    }

    @Override
    public boolean aMonthPasses() {
        if (getHealth() < 5) {
            System.out.println("The elephant is in poor health");
            return false;
        }
        System.out.println("The elephant is excellent");
        return true;
    }

    @Override
    public String toString() {
        return "Elephant";
    }
}
