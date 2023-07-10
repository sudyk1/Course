package com.example.basics.date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        printDate(ld);

        ld.plusYears(10);
        ld.minusMonths(3);
        ld.plusDays(1);
        printDate(ld);


    }

    public static void printDate(LocalDate localDate) {
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());

        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
    }
}
