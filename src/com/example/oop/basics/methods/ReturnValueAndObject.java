package com.example.oop.basics.methods;

class MathMethods {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public Circle getNewCricle(float radius) {
        Circle c = new Circle(radius);
        return c;
    }
}

class Circle {
    float radius;

    Circle(float r) {
        this.radius = r;
    }
}

public class ReturnValueAndObject {
    public static void main(String[] args) {
        MathMethods methods = new MathMethods();
        int a = methods.add(2,3);

        Circle circle = methods.getNewCricle(10.0f);
    }
}
