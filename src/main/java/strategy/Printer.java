package strategy;

import lombok.Data;

@Data
public class Printer {

   private IFontFormatter formatter = null;

    public void setFormatter(IFontFormatter formatter) {
        this.formatter = formatter;
    }

    public String print(String text) {
        return formatter.changeText(text);
    }
}
