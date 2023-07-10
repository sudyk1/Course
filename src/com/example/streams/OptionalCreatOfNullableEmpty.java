package com.example.streams;

import java.util.Optional;

public class OptionalCreatOfNullableEmpty {
    public static void main(String[] args) {
        //Optional.of() tworzy optional, który nie moze byc null
        Optional<String> opt1 = Optional.of("test");
        System.out.println(opt1.get());

        //Exception in thread "main" java.lang.NullPointerException
        //Optional<String> opt2 = Optional.of(null);

        Optional<String> opt3 = Optional.ofNullable("optional 3");
        System.out.println(opt3.get()); // optional  3

        Optional<String> opt4 = Optional.ofNullable(null);
        System.out.println(opt4); // Optional.empty

        Optional<String> opt5 = Optional.empty();
        System.out.println(opt5);


        Integer integer = Integer.valueOf(10);
//        integer = null;
        Optional<Integer> optInt = Optional.ofNullable(integer);

        if (optInt.isPresent()) {
            System.out.println(optInt.get());
        } else {
            System.out.println("optInt jest null");
        }

        optInt.ifPresent(i -> System.out.println(i));
        optInt.ifPresent(System.out::println);




    }
}
