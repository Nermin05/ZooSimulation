package business.concretes;

import business.abstracts.ZooService;
import zookeepers.Zookeeper;

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
}
