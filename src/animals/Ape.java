package animals;

import enums.Foods;

public abstract class Ape extends Animal{
    public Ape(int age, char gender, int health, int lifeExpectancy) {
        super(age, gender, health, lifeExpectancy);
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
        if (getHealth() < 5) {
            System.out.println("The type of ape is in poor health");
            return false;
        }
        System.out.println("The type of ape is excellent");
        return true;    }
}
