package com.example.oop.basics.inheritance.final_example;

class Employee {
    String name, surname, jobTitle;
    float salary;
}

class Manager extends Employee {
    String responsibility;
}

class Director extends Manager {
    String department;
}

class VicePresident extends Director {

}

final class CEO extends VicePresident {
    String companyName;
}

// Nie mozna rozszerzych klasy final
//class Something extends CEO {
//
//}

public class TestJava {
    public static void main(String[] args) {
        CEO ceo = new CEO();
    }
}
