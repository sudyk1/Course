package com.example.basics.date.challange;

import java.util.Calendar;
import java.util.Date;

public class CalendarChallange {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);

        c.add(Calendar.DAY_OF_YEAR, 3);
        c.add(Calendar.HOUR, 10);
        c.add(Calendar.MINUTE, 25);
        c.add(Calendar.SECOND, 6);

        Date d2 = c.getTime();

        System.out.println(d);
        System.out.println(d2);
    }
}
