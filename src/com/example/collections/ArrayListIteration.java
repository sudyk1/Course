package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String name, manufacutrer;
    private int year;

    public Car(String name, String manufacutrer, int year) {
        this.name = name;
        this.manufacutrer = manufacutrer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacutrer() {
        return manufacutrer;
    }

    public void setManufacutrer(String manufacutrer) {
        this.manufacutrer = manufacutrer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacutrer='" + manufacutrer + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Charger", "Dodge", 2020));
        cars.add(new Car("Golf", "VW", 2020));
        cars.add(new Car("Optima", "Kia", 2020));

        System.out.println("Pętla for: ");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car);
        }

        System.out.println("\nPętla for each: ");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nIterator: ");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }
    }
}
