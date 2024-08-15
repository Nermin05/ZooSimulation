package animals;

import enums.Foods;

public abstract class Ape extends Animal{
    @Override
    public void setFoods(String[] foods) {
        foods= new String[]{Foods.FRUIT.name(), Foods.ICE_CREAM.name()};
        for(String food:foods) {
            System.out.println("Can eat:"+food);
        }
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
