package com.example.basics.data.string_class;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Ola ma kota.").append(123);
        sb.append(" Kolejny tekst");

        sb.insert(0, "Kasia ma psa. ");

        System.out.println(sb);
        sb.replace(0, 5,"Julia");
        System.out.println(sb);

        sb.insert(12, " oraz kota");
        System.out.println(sb);

        int index = sb.indexOf("123");
        sb.delete(index, sb.length());
        System.out.println(sb);


    }
}
