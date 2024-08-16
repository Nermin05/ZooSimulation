package animals;

import enums.Foods;

public class Bear extends Animal{
    @Override
    public void setFoods(Foods foods) {
            System.out.println("Bear can eat:"+Foods.STEAK+","+ Foods.FISH.name());

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
        if(hug()<10) System.out.println(getHealth());
        else System.out.println(10);
    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
