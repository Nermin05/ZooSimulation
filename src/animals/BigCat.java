package animals;

import enums.Foods;

public abstract class BigCat extends Animal {
    @Override
    public void setFoods(String[] foods) {
    foods= new String[]{Foods.STEAK.name(), Foods.CELERY.name()};
    for(String food:foods) {
        System.out.println("Can eat:"+food);
    }
    }

    @Override
    public int getLifeExpectancy() {
        return 24;
    }
public abstract int stroked();
    @Override
    public void treat() {
        if(stroked()<10) System.out.println(getHealth());
        else System.out.println(10);    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
