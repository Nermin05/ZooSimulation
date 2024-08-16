package animals;

import enums.Foods;

public class Penguin extends Animal{
    @Override
    public void setFoods(Foods foods) {
            System.out.println("Penguin can eat:"+Foods.ICE_CREAM+","+ Foods.FISH);

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
        if(watchAFilm()<10) System.out.println(getHealth());
        else System.out.println(10);
    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
