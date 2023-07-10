package com.example.basics.data.string_class.challange;

public class Main {
    public static void main(String[] args) {

        String text = "Ola ma kota. ".repeat(3);
        text = text.replaceAll("Ola", "Kasia");
        text = text.replaceFirst("Kasia", "Monika");
        System.out.println(text);
        int index = text.indexOf("Kasia");
        System.out.println("Pierwsze wystąpienie 'Kasia': " + index);
        index = text.lastIndexOf("Kasia");
        System.out.println("Ostatnie wystąpienie 'Kasia': " + index);
        System.out.println(text.substring(text.indexOf("Kasia")));

    }
}
