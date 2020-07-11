package strategy;

public class UpperFormatter implements IFontFormatter {


    @Override
    public String changeText(String textToChange) {
        return textToChange.toUpperCase();
    }
}
