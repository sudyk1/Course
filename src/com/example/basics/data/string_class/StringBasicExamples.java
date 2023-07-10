package com.example.basics.data.string_class;

public class StringBasicExamples {

    public static void main(String[] args) {
        String s1 = "Hello World!";
//        char test = 'j';

        String s2 = new String("Hello World!");
        s2 = "Hello World!";

        System.out.println(s1 == s2);

        String s3 = "*".repeat(10);
        System.out.println(s3);

        String s4 = String.join("", "Adam", "Kamil", "Kozak");
        System.out.println(s4);

        char[] arr = {'o','l','a'};
        String ola = new String(arr);
        System.out.println(ola);
    }
}
