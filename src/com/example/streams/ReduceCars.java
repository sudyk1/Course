package com.example.streams;

import java.util.ArrayList;

public class ReduceCars {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Mercedes", 250, 400000, 5 ));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 300000, 5));

        int totalPrice = cars.stream()
                .reduce(0, (subtotal, car) -> subtotal + car.getPrice(), Integer::sum);
        System.out.println(totalPrice);

    }
}
