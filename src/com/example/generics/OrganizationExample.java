package com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person {
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: " + this.getName() +
                " jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

class Contractor extends Employee {
    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    @Override
    public String toString() {
        return "Contractor{ " + super.toString() +" }";
    }
}

class Oraganization<T extends Person> {
    private ArrayList<T> participants;

    public Oraganization() {
        this.participants = new ArrayList<T>();
    }

    public void addParticipant(T participant) {
        this.participants.add(participant);
    }

    public T getParticipant(int index) {
        return this.participants.get(index);
    }

    public void printParticipants() {
        Iterator<T> i = this.participants.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


public class OrganizationExample {
    public static void main(String[] args) {
        Oraganization<Employee> employees = new Oraganization<>();
        employees.addParticipant(new Employee("Adam", "Programista"));
        employees.addParticipant(new Employee("Kasia", "HR"));
        employees.addParticipant(new Employee("Ewa", "Dyrektor"));
        employees.addParticipant(new Contractor("Daniel", "Programista"));

        employees.printParticipants();
    }
}
