package com.example.basics.date;

import java.util.Date;

public class PrintfExmaple {
    public static void main(String[] args) {

        System.out.printf("Hello %s %d %f %b %nData: %tc", "World", 12, 5.6f, true, new Date());

        System.out.printf("%n%nHello %s %2$td.%2$tm.%2$tY", "World", new Date());

        String str = String.format("%n%n%1$tT", new Date());
        System.out.println(str);

        str = String.format("%n%1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);
    }
}
