package animals;

import enums.Foods;

public class Elephant extends Animal{
    @Override
    public void setFoods(Foods foods) {
            System.out.println("Elephant can eat:"+Foods.HAY+","+ Foods.FRUIT);

    }

    @Override
    public int getLifeExpectancy() {
        return 36;
    }

    @Override
    public boolean eat(boolean ifEat) {
        return ifEat;
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
    public boolean aMonthPasses() {
        return false;
    }
}
