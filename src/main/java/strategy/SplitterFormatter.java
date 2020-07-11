package strategy;

public class SplitterFormatter implements IFontFormatter {
    @Override
    public String changeText(String textToChange) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < textToChange.length(); i++) {
            builder.append(textToChange.charAt(i)).append(' ');
        }
        return builder.toString();
    }
}
