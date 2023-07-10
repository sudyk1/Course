package com.example.oop.basics.inheritance.instanceof_operator;

class Animal {
    protected String name;
    protected float weight; // kg
    protected int numLegs; //ilosc nóg

}

class Dog extends Animal {
    protected void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Bird extends Animal {
    protected void fly() {
        System.out.println("Bird flys!");
    }
}


public class InstanceOfExample {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("bird instanceof Animal: " + (bird instanceof Animal));
//        System.out.println("bird instanceof Dog: " + (bird instanceof Dog)); // bład kompilacji
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
    }
}
