package business.concretes;

import animals.Animal;
import business.abstracts.ZooService;
import zookeepers.Zookeeper;

import java.util.Iterator;
import java.util.List;

public class ZooManager implements ZooService {
     EnclosureManager[] enclosureManagers;
     List<Zookeeper> zookeeperList;
    public ZooManager(EnclosureManager[] enclosureManagers, List<Zookeeper> zookeeperList) {
        this.enclosureManagers = enclosureManagers;
        this.zookeeperList = zookeeperList;
    }

    @Override
    public void aMonthPasses() {

    }

    @Override
    public void aMonthPassesZookeepers() {
        Iterator<Zookeeper> keeperIterator=zookeeperList.iterator();
while (keeperIterator.hasNext()) {
Zookeeper zookeeper=keeperIterator.next();
//zookeeper.
}

    }

    @Override
    public void checkAnimalsHP() {
for(EnclosureManager enclosureManager:enclosureManagers) {
    for (Animal animal : enclosureManager.animalList) {
        if(animal.getHealth()==0){
            enclosureManager.animalList.remove(animal);
        }
    }

}
    }

    @Override
    public void go() {
        while (true) {
            aMonthPasses();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
