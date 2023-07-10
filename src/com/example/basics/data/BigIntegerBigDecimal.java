package com.example.basics.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("123412312412431231232333123");
        bigInt = bigInt.add(new BigInteger("123123412412412412444"));
        System.out.println("Wynik: " + bigInt);

        BigDecimal decimal = new BigDecimal("11233342332.32032392094234234234324");
        decimal = decimal.pow(3);
        System.out.println(decimal);
        decimal = decimal.subtract(new BigDecimal("12312312333332.21333333333312322222414"));
        System.out.println(decimal);

    }
}

