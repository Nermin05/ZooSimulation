package enums;

public enum Foods {
    HAY(1,4),
    STEAK(3,4),
    FRUIT(2,3),
    CELERY(0,1),
    FISH(3,2),
    ICE_CREAM(1,3);
    private int health;
   private int waste;
    Foods(int health,int waste) {
this.health=health;
this.waste=waste;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }
}
