package com.example.oop.basics.inheritance.example1;

public class Bicycle extends Vehicle {

    Bicycle() {
//        super() - dodane automatycznie, gdy nie ma
        this.type = "Bicycle";
        this.manufacturer = "Romet";
        this.topSpeed = 30;
    }
}
