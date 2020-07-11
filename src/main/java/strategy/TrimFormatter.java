package strategy;

public class TrimFormatter implements IFontFormatter {
    @Override
    public String changeText(String textToChange) {
        return textToChange.trim();
    }
}
