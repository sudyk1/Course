package com.example.oop.basics.inheritance.example2_shop;

public class Computer extends Product {
    private Mouse mouse;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer() {
        this.mouse = new Mouse();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
    }
}
