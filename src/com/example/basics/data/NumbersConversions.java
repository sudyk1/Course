package com.example.basics.data;

public class NumbersConversions {
    public static void main(String[] args) {

        //konwersja jawna - zawężająca
        int i = 5;
        double d = 20.0d / (double) i;
        System.out.println(d);

        //konwersja niejawana - rozszerzająca
        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        double d2 = 5.0;
        int num = 10 * (int)d2; // przy konwersji float/doube na typ całkowity
        //cześć ułamkowa jest tracona
        System.out.println(num); // 50

        byte small = (byte)257;
        System.out.println("small: " + small);

    }
}
