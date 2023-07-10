package com.example.basics.date;

import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 12, 12);
        LocalDate date2 = LocalDate.of(2021, 11, 11);

        if(date1.isAfter(date2)) {
            System.out.println("2022 > 2021");
        }

        if(date2.isBefore(date1)) {
            System.out.println("2021 < 2022");
        }
    }
}
