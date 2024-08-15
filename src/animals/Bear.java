package animals;

import enums.Foods;

public class Bear extends Animal{
    @Override
    public void setFoods(String[] foods) {
        foods= new String[]{Foods.STEAK.name(), Foods.FISH.name()};
        for(String food:foods) {
            System.out.println("Bear can eat:"+food);
        }
    }

    @Override
    public int getLifeExpectancy() {
        return 18;
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
