package observer;

public class Main {
    public static void main(String[] args) {
        Watcher watcher1 = new Watcher(2);
        Watcher watcher2 = new Watcher(4);
        Watcher watcher3 = new Watcher(6);
        Watcher watcher4 = new Watcher(8);
        Watcher watcher5 = new Watcher(10);
        Watcher watcher6 = new Watcher(1);

        NewsStation station = new NewsStation();
        station.addObserver(watcher1);
        station.addObserver(watcher2);
        station.addObserver(watcher3);
        station.addObserver(watcher4);
        station.addObserver(watcher5);
        station.addObserver(watcher6);

        station.setFacts(new Message("Jutro wybory!", 5));
    }
}
