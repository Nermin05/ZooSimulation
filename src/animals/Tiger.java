package animals;

import enums.Foods;

import java.util.ArrayList;
import java.util.List;

public class Tiger extends BigCat{
    public Tiger(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
    }

    @Override
    public int stroked() {
        if (checkHealth()) {
            setHealth(getHealth()+3);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public boolean eat(boolean ifEat) {
       return ifEat;
    }

    @Override
    public List<Foods> edibleFoods() {
        List<Foods> edible = new ArrayList<>();
        if (canEat("STEAK")) {
            edible.add(Foods.STEAK);
        }
        if (canEat("CELERY")) {
            edible.add(Foods.CELERY);
        }
        return edible;
    }

    @Override
    public String toString() {
        return "Tiger";
    }
}
