package com.example.oop.basics.interface_basics;

public class InterfaceExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.move();

        Vehicle vehicle = car;

        vehicle.turn();

    }
}
