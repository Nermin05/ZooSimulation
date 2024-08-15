package entities;

import enums.Foods;

public class Penguin extends Animal{
    @Override
    public void setFoods(String[] foods) {
        foods= new String[]{Foods.ICE_CREAM.name(), Foods.FISH.name()};
        for(String food:foods) {
            System.out.println("Penguin can eat:"+food);
        }
    }

    @Override
    public int getLifeExpectancy() {
        return 15;
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
