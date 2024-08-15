package entities;

public class Chimpanzee extends Ape{
    @Override
    public int getLifeExpectancy() {
        return 24;
    }
    public int playChase() {
        if (checkHealth()) {
            setHealth(getHealth()+3);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public void treat() {
        if(playChase()<10) System.out.println(getHealth());
        else System.out.println(10);
    }
}
