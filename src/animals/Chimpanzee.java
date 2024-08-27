package animals;

import enums.Foods;

import java.util.ArrayList;
import java.util.List;

public class Chimpanzee extends Ape{

    public Chimpanzee(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
    }

    @Override
    public int getLifeExpectancy() {
        return 24;
    }

    @Override
    public boolean eat(boolean ifEat) {
        return ifEat;
    }

    public int playChase() {
        if (checkHealth()) {
            setHealth(getHealth()+3);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public void treat() {
        if(playChase()<10) System.out.println(getHealth()+2);
        else System.out.println(10);
    }

    @Override
    public List<Foods> edibleFoods() {
        List<Foods> edible = new ArrayList<>();
        if (canEat("FRUIT")) {
            edible.add(Foods.FRUIT);
        }
        if (canEat("ICE CREAM")) {
            edible.add(Foods.ICE_CREAM);
        }
        return edible;
    }

    @Override
    public String toString() {
        return "Chimpanzee";
    }
}
