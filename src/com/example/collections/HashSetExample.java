package com.example.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Animal {
    private String name;

    public Animal(String name) {
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
        return "Animal: "+ name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.name.equals(animal.getName());
    }
}


public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Animal> set = new HashSet<>();
        Animal a = new Animal("Tiger");
        set.add(a);
        set.add(a);
        set.add(new Animal("Lion"));
        set.add(new Animal("Dog"));
        set.add(new Animal("Tiger"));


        System.out.println(set);
        Iterator<Animal> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
