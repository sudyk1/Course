package com.example.basics.data;

public class MathRoundCeilFloor {
    public static void main(String[] args) {

        //zaokroglenie do najblizszej liczby całkowitej
        System.out.println(Math.round(5.51)); // 6
        System.out.println(Math.round(5.49)); // 5

        //rzutowanie utrata czesci ulamkowej
        System.out.println((int)5.45);

        //Math.ceil() - najwieksza mozliwa calkowita liczba
        System.out.println(Math.ceil(6.11)); // 7.0
        System.out.println(Math.ceil(6.8));  // 7.0

        //Math.floor() -  najmniejsza mozliwa liczba calkowita
        System.out.println(Math.floor(6.11)); // 6.0
        System.out.println(Math.floor(6.99)); // 6.0
    }
}
