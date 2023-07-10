package com.example.oop.basics.access_modifiers.public_example;

import com.example.oop.basics.access_modifiers.public_example.package1.BasicClass;
import com.example.oop.basics.access_modifiers.public_example.package2.OtherClass;

public class Test {
    public static void main(String[] args) {

        BasicClass basicClass = new BasicClass();
        OtherClass otherClass = new OtherClass();

        basicClass.name = "basic";

        otherClass.setName("otherClass");
    }
}
