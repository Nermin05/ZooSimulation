package entities;

import enums.Foods;

public class Giraffe extends Animal{
    @Override
    public void setFoods(String[] foods) {
        foods= new String[]{Foods.HAY.name(), Foods.FRUIT.name()};
        for(String food:foods) {
            System.out.println("Giraffe can eat:"+food);
        }
    }

    @Override
    public int getLifeExpectancy() {
        return 28;
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
