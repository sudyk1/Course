package com.example.oop.basics.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Kowalski", 29);
        Manager manager = new Manager("Wojtek", "Sudyka", 41, "HR");

        Person person = manager;
        employee.printInfo();

        System.out.println(person.getName());
        System.out.println(manager.getDepartenentName());
    }
}
