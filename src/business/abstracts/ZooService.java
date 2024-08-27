package business.abstracts;

import zookeepers.Zookeeper;

public interface ZooService {
    void aMonthPasses();
    void checkAnimalsHP();
    void go();
    void writeFile(String fileName);
    void addZookeeper(Zookeeper zookeeper);
}
