package zookeepers;

import animals.*;

import java.util.List;

public class PlayZooKeeper extends Zookeeper{
    public PlayZooKeeper(String name) {
        super(name);
    }
    @Override
    public void giveTreat(List<Animal> animals) {
        int give=0;
        for(Animal animal:animals) {
            if(give>=2)  break;
            if(animal instanceof Chimpanzee){
                ((Chimpanzee) animal).playChase();
                give++;
            }
            if(animal instanceof Gorilla) {
                ((Gorilla) animal).painting();
                give++;
            }
            if(animal instanceof Penguin) {
                ((Penguin) animal).watchAFilm();
                give++;
            }

        }
    }
}
