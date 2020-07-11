package abstractfactory.example;


import abstractfactory.example.carpackage.AbstractCarFactory;
import abstractfactory.example.carpackage.Car;
import abstractfactory.example.carpackage.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.createBMWe36();


        Car car2 = AbstractCarFactory.createBMWe36();



//        Car samochod = new Car();
    }
}
