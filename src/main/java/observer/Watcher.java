package observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private final int PANIC_LEVEL ;

    public Watcher(int PANIC_LEVEL) {
        this.PANIC_LEVEL = PANIC_LEVEL;
    }

    @Override
    public void update(Observable observable, Object content) {
        if (content instanceof Message) {
            Message incoming = (Message) content;
            if(incoming.getImportance() > PANIC_LEVEL)
            System.out.println("Watcher reached panic level at: " + this.PANIC_LEVEL);
        }
    }


}
