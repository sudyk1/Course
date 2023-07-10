package com.example.oop.basics.inheritance.abstract_classes;

public class Employee extends Person {

    public Employee() {
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Employee: " + this.getName() + " " + this.getSurname());
    }

}
