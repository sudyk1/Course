package com.example.basics.date.challange;

import java.time.LocalDateTime;

public class LDTexercise {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.of(2025, 12, 30, 12, 30);

        if (date.isAfter(now)) {
            System.out.println("Data jest z przyszłości");
        }



    }
}
