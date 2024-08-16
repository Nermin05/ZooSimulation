package animals;

public class Lion extends BigCat{

    @Override
    public int stroked() {
        if (checkHealth()) {
            setHealth(getHealth()+3);
            return getHealth();
        }
        return getHealth();
    }

    @Override
    public boolean eat(boolean ifEat) {
        return ifEat;
    }
}
