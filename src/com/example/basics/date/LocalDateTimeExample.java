package com.example.basics.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = dtf.format(localDateTime);
        System.out.println(str);

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfMonth());

        localDateTime = localDateTime.plusYears(2);
        localDateTime = localDateTime.minusMonths(1);

        System.out.println(dtf.format(localDateTime));
    }
}
