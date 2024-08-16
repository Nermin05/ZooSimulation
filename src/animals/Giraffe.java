package animals;

import enums.Foods;

public class Giraffe extends Animal{
    @Override
    public void setFoods(Foods foods) {
            System.out.println("Giraffe can eat:"+Foods.HAY+"," +Foods.FRUIT);

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
    public boolean aMonthPasses() {
        return false;
    }
}
