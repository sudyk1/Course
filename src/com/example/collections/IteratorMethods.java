package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Dodge");
        arr.add("Pontiac");
        arr.add("Merc");

        arr.iterator().forEachRemaining(s -> {
            System.out.println(s);
        });

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if(str.equalsIgnoreCase("Merc")) {
                iterator.remove();
            }
        }

        System.out.println(arr);

    }
}
