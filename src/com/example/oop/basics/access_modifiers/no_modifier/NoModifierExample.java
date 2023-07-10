package com.example.oop.basics.access_modifiers.no_modifier;

import com.example.oop.basics.access_modifiers.no_modifier.package1.Laptop;
import com.example.oop.basics.access_modifiers.no_modifier.package2.Computer;

public class NoModifierExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        computer.name = "Mac";  // brak dostepu z innego pakietu protected
        computer.setName("Mac");

        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());

    }
}
