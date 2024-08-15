package entities;

public class Gorilla extends Ape{
    @Override
    public int getLifeExpectancy() {
        return 32;
    }
    public int painting() {
        if (checkHealth()) {
            setHealth(getHealth()+4);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public void treat() {
        if(painting()<10) System.out.println(getHealth());
        else System.out.println(10);
    }
}
