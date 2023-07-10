package com.example.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car(String manufacturer, String name, int year, String color, float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public Car() {
    }

    public void printInfo() {
        System.out.println(this.manufacturer + " "
                + this.name + " "
                + this.year);
    }
}



public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car("Ford","Mustang", 1967,"Blue",200.0f);
        ford.printInfo();

        Car chevrolet = new Car("Chevrolet","Camaro" ,2020 ,"Red" ,300f);
        chevrolet.printInfo();

        Car dodge = new Car();
        dodge.printInfo();
    }
}
