package com.example.oop.basics.inheritance.example1;

public class Car extends Vehicle {
    Car() {
        super();
        this.type = "Car";
        this.manufacturer = "Ford";
        this.topSpeed = 200f;
    }

    Car(String manufacturer, float topSpeed) {
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }
}

