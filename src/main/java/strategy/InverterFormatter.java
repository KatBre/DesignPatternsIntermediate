package strategy;



public class InverterFormatter implements IFontFormatter {
    @Override
    public String changeText(String textToChange) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < textToChange.length(); i++) {
            if (Character.isLowerCase((textToChange.charAt(i)))) {
                builder.append(Character.toUpperCase((textToChange.charAt(i))));
            } else if (Character.isUpperCase((textToChange.charAt(i)))) {
                builder.append(Character.toLowerCase(textToChange.charAt(i)));
            } else {
                builder.append(textToChange.charAt(i));
            }

        }
        return builder.toString();
    }
}
