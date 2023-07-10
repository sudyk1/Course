package com.example.basics.data.string_class;

public class BlankStringAndNULL {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.length());
        s1 = s1.concat("Hello World!");

        String s2 = null;
        s2 = "test";
        s2 = s2.concat("sd");

        s2 = null;
    }
}
