package com.example.basics.date.challange;

import java.util.Date;

public class Timestamp {
    public static void main(String[] args) {
        Date d = new Date();
        long timestamp = d.getTime();
        System.out.println(d);
        timestamp += 3 * dayMili() + 10 * hourMili() + 25 * minuteMili();

        Date future = new Date(timestamp);
        System.out.println(future);
    }


    public static long dayMili() {
        return 24 * 60 * 60 * 1000;
    }

    public static long hourMili() {
        return 60 * 60 * 1000;
    }

    public static long minuteMili() {
        return 60 * 1000;
    }

    public static long secondMili() {
        return 1000;
    }
}
