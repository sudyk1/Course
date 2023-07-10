package com.example.basics.date.challange;

import java.util.Date;

public class PrintfChallange {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.printf("Rok: %1$tY, miesiac: %1$tm, dzien: %1$td", d);

    }
}
