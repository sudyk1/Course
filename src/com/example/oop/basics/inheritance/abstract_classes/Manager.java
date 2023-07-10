package com.example.oop.basics.inheritance.abstract_classes;

public class Manager extends Employee {

    private String departenentName;

    public Manager() {
        this.departenentName = "unknown";
    }

    public Manager(String name, String surname, int age, String departenentName) {
        super(name, surname, age);
        this.departenentName = departenentName;
    }

    public String getDepartenentName() {
        return departenentName;
    }

    public void setDepartenentName(String departenentName) {
        this.departenentName = departenentName;
    }

    @Override
    public void printInfo() {
        System.out.println("Manager " + this.getName() + " " + this.getSurname() + " " + this.getDepartenentName());
    }

}
