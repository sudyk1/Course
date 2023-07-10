package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Object
        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("info");

        String strEl = (String) basicList.get(0);
//        System.out.println(strEl);

        // <>
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Kasia");
        stringArrayList.add("Adam");
        stringArrayList.add("Anna");
        stringArrayList.remove(1);
        stringArrayList.add("Olek");

        for (String s : stringArrayList) {
            System.out.println(s);
        }
        stringArrayList.add(0, "Zuza");

        System.out.println();
        for (String s : stringArrayList) {
            System.out.println(s);
        }

        System.out.println();
        stringArrayList.set(1, "Katarzyna");
        for (String s : stringArrayList) {
            System.out.println(s);
        }


        System.out.println("\nAfter sorting:");
        Collections.sort(stringArrayList);
        for (String s : stringArrayList) {
            System.out.println(s);
        }


        System.out.println("\nAfter removing:");
        stringArrayList.remove(0);
        for (String s : stringArrayList) {
            System.out.println(s);
        }




    }
}
