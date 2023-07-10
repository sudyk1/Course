package com.example.basics.date;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        printDate(lt);

        lt = lt.plusHours(3);
        lt = lt.plusSeconds(123);
        lt = lt.plusMinutes(50);
        printDate(lt);

    }

    public static void printDate(LocalTime lt) {
        System.out.println("Godziny: " + lt.getHour());
        System.out.println("Minuty: "+ lt.getMinute());
        System.out.println("Sekundy: "+ lt.getSecond());
    }
}
