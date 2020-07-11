package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            command = scanner.nextLine();
            if (command.startsWith("zmien")) {
                formatterChanger(printer, command.split(" ")[1]);
            } else if (command.startsWith("formatuj")) {
                printerChanger(printer, command.split(" ", 2)[1]);

            }

        } while (!command.equalsIgnoreCase("quit"));
    }

    private static void printerChanger(Printer printer, String textToPrint) {
        System.out.println(printer.print(textToPrint));
    }

    private static void formatterChanger(Printer printer, String type) {
        if (type.equalsIgnoreCase("upper")) {
            printer.setFormatter(new UpperFormatter());
        } else if (type.startsWith("lower")) {
            printer.setFormatter(new LowerFormatter());
        } else if (type.startsWith("trim")) {
            printer.setFormatter(new TrimFormatter());
        } else if (type.startsWith("inverter")) {
            printer.setFormatter(new InverterFormatter());
        } else if (type.startsWith("splitter")) {
            printer.setFormatter(new SplitterFormatter());
        }
    }
}

