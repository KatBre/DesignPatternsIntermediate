package decorator.ex2;

public class Main {
    public static void main(String[] args) {
    Pizzeria pizzeria = new Pizzeria();
    CustomPizza myPizza1 = pizzeria.createHawaiiPizza();
    CustomPizza myPizza2 = pizzeria.createMargharritaPizza();
    CustomPizza myPizza3 = pizzeria.createPepperoniPizza();
    CustomPizza myPizza4 = pizzeria.createScampiPizza();
    CustomPizza myPizza5 = pizzeria.createQuattroFormaggiPizza();
    CustomPizza myPizza6 = pizzeria.createVegetarianPizza();


    }
}
