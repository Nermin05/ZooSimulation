package entities;

public class Elephant extends Animal{
    @Override
    public int getLifeExpectancy() {
        return 36;
    }

    @Override
    public void eat() {

    }

    @Override
    public void treat() {

    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
