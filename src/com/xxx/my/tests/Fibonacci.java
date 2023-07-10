package com.xxx.my.tests;

public class Fibonacci {
    public static void main(String[] args) {

//        System.out.println(fibRecursive(0));
//        System.out.println(fibRecursive(1));
//        System.out.println(fibRecursive(2));
//        System.out.println(fibRecursive(3));
//        System.out.println(fibRecursive(4));
//        System.out.println(fibRecursive(34));
//        System.out.println(fibNormal(34));
        int xd = 34;

        printFibonnaci(34, "rec");
        printFibonnaci(34, "nor");

    }


    public static int fibRecursive(int numberAt) {
        if (numberAt <= 1) return numberAt;
        return fibRecursive(numberAt - 1) + fibRecursive(numberAt - 2);
    }

    public static int fibNormal(int numberAt) {
        int a = 0;
        int b = 1;
        if (numberAt == 0) return a;
        if (numberAt == 1) return b;
        if (numberAt == 2) return b;

        for (int i = 1; i < numberAt; i++) {
            int temp = a;
            a = b;
            b = b + temp;
        }
        return b;
    }

    public static void printFibonnaci(int numbers, String method) {
        switch (method) {
            case "rec": {
                for (int i = 0; i <= numbers; i++) {
                    System.out.print(fibRecursive(i) + ", ");
                }
                System.out.println();
                break;
            }
            case "nor": {
                for (int i = 0; i <= numbers; i++) {
                    System.out.print(fibNormal(i) + ", ");
                }
                System.out.println();
                break;
            }
        }

    }
}
