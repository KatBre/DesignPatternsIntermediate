package decorator.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Pizzeria {
    public CustomPizza createMargharritaPizza() {
        return new CustomPizza(new SimplePizza(), Arrays.asList(""));
    }

    public CustomPizza createQuattroFormaggiPizza() {
        return new CustomPizza(new SimplePizza(), Arrays.asList("camembert", "gouda", "roquefort", "feta"));
    }

    public CustomPizza createPepperoniPizza() {
        return new CustomPizza(new SimplePizza(), Arrays.asList("pepperoni", "salami", "jalapeno", "tomatoes"));
    }

    public CustomPizza createHawaiiPizza() {
        return new CustomPizza(new SimplePizza(), Arrays.asList("pineapple", "ham"));
    }

    public CustomPizza createVegetarianPizza() {
        return new CustomPizza(new SimplePizza(), Arrays.asList("paprika", "zucchini", "aubergine", "tomatoes", "spinach"));
    }

    public CustomPizza createScampiPizza() {
        return new CustomPizza(new SimplePizza(), Arrays.asList("scampi", "rocket", "garlic"));
    }

    public CustomPizza createSuperPizza(String myIngredient) {
        Scanner scanner = new Scanner(System.in);
        myIngredient = scanner.nextLine();
        return new CustomPizza(new SimplePizza(), Arrays.asList(myIngredient));
    }

}
