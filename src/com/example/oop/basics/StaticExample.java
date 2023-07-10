package com.example.oop.basics;

class PlaneWithStatic {
    static int nextId = 1;

    int id;
    int x, y;

    PlaneWithStatic() {
        id = getNextId();
    }

    static int getNextId() {
        return nextId++;
    }

}

// StaticExample.main(args)
public class StaticExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();

        System.out.println("plane1.id: " + plane1.id);
        System.out.println("plane2.id: " + plane2.id);
        System.out.println("plane3.id: " + plane3.id);
    }
}
