package com.example.collections;

import java.util.ArrayList;

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


public class ArrayListMethods {
    public static void main(String[] args) {
        Person p1 = new Person("Adam");
        Person p2 = new Person("Kasia");
        Person p3 = new Person("Rafał");
        Person p4 = new Person("Anna");

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for (Person person : people) {
            System.out.println(person);
        }

        Person p5 = new Person("Bartek");
        Person p6 = new Person("Marek");

        ArrayList<Person> people1 = new ArrayList<>();
        people1.add(p5);
        people1.add(p6);

        people.addAll(people1);
        System.out.println("\nPo dodaniu kolekcji:");
        for (Person person : people) {
            System.out.println(person);
        }

        if(people.contains(p4)) {
            System.out.println("\nPeople posiada p4");
        }

        if(people.containsAll(people1)) {
            System.out.println("\nPeople zawiera people1");
        }

        Person p7 = new Person("Daniel");
        people1.add(p7);
        if(people.containsAll(people1)) {
            System.out.println("\nPeople zawiera people1");
        } else {
            System.out.println("\nPeople nie posiada wszystkich elemetów people1");
        }

        people1.remove(p7);
        if(people.containsAll(people1)) {
            System.out.println("\nPeople zawiera people1");
        } else {
            System.out.println("\nPeople nie posiada wszystkich elemetów people1");
        }

        people.removeAll(people1);
        System.out.println("\nPo usunieciu kolekcji:");
        for (Person person : people) {
            System.out.println(person);
        }

        Person[] people3 = new Person[people.size()];
        people3 = people.toArray(people3);
        System.out.println(people3.length);

        people.clear();
        if(people.isEmpty()) {
            System.out.println("Kolekcja pusta");
        }
    }
}
