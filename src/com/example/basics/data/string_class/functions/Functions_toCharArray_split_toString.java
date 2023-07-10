package com.example.basics.data.string_class.functions;

public class Functions_toCharArray_split_toString {
    public static void main(String[] args) {

        String str = "Ola ma kota";

        char[] arr = str.toCharArray();
        System.out.println("Liczba znaków: " + arr.length);

        String[] strArr = str.split(" ");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
