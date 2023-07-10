package com.example.oop.basics.interface_basics;

public class Car implements Vehicle {

    private float speed, topSpeed;
    private String brand, model, color;

    public Car() {
    }

    public Car(float speed, String brand, String model, String color) {
        this.speed = speed;
        this.topSpeed = 200;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Car is moving!");
    }

    @Override
    public void stop() {
        System.out.println("Car stops.");
    }

    @Override
    public void turn() {
        System.out.println("Car turns.");
    }

    @Override
    public float getTopSpeed() {
        return this.topSpeed;
    }
}
