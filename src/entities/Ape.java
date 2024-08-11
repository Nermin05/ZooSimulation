package entities;

public class Ape extends Animal{
    @Override
    public int getLifeExpectancy() {
        return 0;
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
