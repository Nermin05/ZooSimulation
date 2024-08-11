package entities;

public class Bear extends Animal{
    @Override
    public int getLifeExpectancy() {
        return 18;
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
