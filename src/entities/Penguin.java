package entities;

public class Penguin extends Animal{
    @Override
    public int getLifeExpectancy() {
        return 15;
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
