package animals;

import enums.Foods;

public abstract class Ape extends Animal{
    @Override
    public void setFoods(Foods foods) {
            System.out.println("Can eat:"+Foods.FRUIT+","+ Foods.ICE_CREAM);

    }

    @Override
    public int getLifeExpectancy() {
        return 0;
    }

    @Override
    public void treat() {

    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
