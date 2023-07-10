package com.example.oop.basics.methods.challange;

public class CarFactoryChallange {
    public static void main(String[] args) {

        CarFactory factory = new CarFactory();
        Car c = factory.buildCar();
        Car c2 = factory.buildCar();

        c.printInfo();
        c2.printInfo();
    }
}
