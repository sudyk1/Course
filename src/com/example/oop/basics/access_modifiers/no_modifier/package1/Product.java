package com.example.oop.basics.access_modifiers.no_modifier.package1;

public class Product {

    //no modifier - child class in separete package can't access this field
//    String name;
    protected String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
