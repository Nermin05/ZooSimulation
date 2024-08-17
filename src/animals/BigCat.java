package animals;

import enums.Foods;

public abstract class BigCat extends Animal {
    public BigCat(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
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
        if (getHealth() < 4) {
            System.out.println("The type of bigcat is in poor health");
            return false;
        }
        System.out.println("The type of bigcat is excellent");
        return true;
    }
}
