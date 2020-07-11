package observer.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wiadomosc {
    private String nadawca;
    private String tresc;
}
