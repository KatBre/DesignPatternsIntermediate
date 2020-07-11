package observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;

@Data
@NoArgsConstructor
public class NewsStation extends Observable {
    private Message message;

    public void setFacts(Message message) {
        this.message = message;

        setChanged();
        notifyObservers(message);
    }


}
