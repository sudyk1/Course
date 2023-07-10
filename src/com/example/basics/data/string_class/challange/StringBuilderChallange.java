package com.example.basics.data.string_class.challange;

public class StringBuilderChallange {
    public static void main(String[] args) {
        String[] names = {"Ola", "Ash", "Adam", "Ewa", "Piotr"};

        StringBuffer sb = new StringBuffer();
        for (String s : names) {
            sb.append(s);
            sb.append(" ");
        }
        String strNames = sb.toString().trim();
        System.out.println(strNames);

    }
}
