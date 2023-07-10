package com.example.lamba;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add(null);
        cars.add("Aston Martin");
        cars.add(null);
        System.out.println(cars);

        System.out.println("\n\n");

        cars.removeIf( a -> a == null || a.equalsIgnoreCase("mercedes"));
        System.out.println(cars);

    }
}
