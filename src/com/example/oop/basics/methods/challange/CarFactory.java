package com.example.oop.basics.methods.challange;

public class CarFactory {
    public Car buildCar() {
        return new Car("Ford", "Mustang", randomColor());
    }

    private String randomColor() {
        String[] color = {"Red", "Black", "White"};
        int random = (int)(Math.random() * color.length);
        return color[random];
    }

}
