package com.example.oop.basics.access_modifiers.protected_example;

import com.example.oop.basics.access_modifiers.protected_example.package1.Laptop;
import com.example.oop.basics.access_modifiers.protected_example.package2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        computer.name = "Mac";  // brak dostepu z innego pakietu protected
        computer.setName("Mac");

        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());

    }
}
