package com.example.basics.data.string_class.functions;

import java.util.Locale;

public class Functions_length_toLowerCase_toUpperCase_charAt {
    public static void main(String[] args) {

        String str = "Ola ma kota";
        System.out.println("ilość znaków: " + str.length());

        char sign = str.charAt(1);
        System.out.println("znak pod indeksem 1: " + sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLowerCase = str.toLowerCase(Locale.ROOT);
        System.out.println(strLowerCase);

    }
}
