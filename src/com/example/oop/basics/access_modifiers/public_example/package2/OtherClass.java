package com.example.oop.basics.access_modifiers.public_example.package2;

import com.example.oop.basics.access_modifiers.public_example.package1.BasicClass;

public class OtherClass extends BasicClass {

    public OtherClass() {
        this.name = "OtherClass name";
        this.setName("OtherClass name");
    }

}
