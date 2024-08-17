package zookeepers;

import animals.*;

import java.util.List;

public class PhysioZookeeper extends Zookeeper{
    public PhysioZookeeper(String name) {
        super(name);
    }
    public void giveTreat(List<Animal> animals) {
        int give=0;
        for(Animal animal:animals) {
            if(give>=2)  break;
            if(animal instanceof Elephant){
                ((Elephant) animal).bath();
                give++;
            }
            if(animal instanceof Giraffe) {
                ((Giraffe) animal).neckMessage();
                give++;
            }

        }
    }
}
