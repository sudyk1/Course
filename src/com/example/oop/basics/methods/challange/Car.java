package com.example.oop.basics.methods.challange;

public class Car {
    private String model;
    private String brand;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

    public void printInfo() {
        System.out.println("Car: " + this.brand + " " + this.model + " " + this.getColor());
    }
}
