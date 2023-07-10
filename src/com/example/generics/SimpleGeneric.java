package com.example.generics;

class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: " +
                "x=" + x +
                " y=" + y;
    }
}

class Trio<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Trio(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Trio{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}


public class SimpleGeneric {
    public static void main(String[] args) {
        Point<Integer> pointInt = new Point<>(12, 30);
        System.out.println(pointInt);

        Point<String> pointStr = new Point<>("X", "Y");
        System.out.println(pointStr);

        Trio<Integer, String, Float> trio = new Trio<>(12, "Chuj", 10.45f);
        System.out.println(trio);
    }
}
