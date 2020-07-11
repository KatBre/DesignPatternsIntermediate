package strategy;

public class LowerFormatter implements IFontFormatter {
    @Override
    public String changeText(String textToChange) {
        return textToChange.toLowerCase();
    }
}
