package com.example.oop.basics;

class PointWithConstants {
    int x, y;
    final int width = 12;
    final int height;

    PointWithConstants() {
        height = 20;

    }

    PointWithConstants(int posX, int posY) {
        this();
        this.x = posX;
        this.y = posY;
    }

    public void changePosition(int newX, final int newY) {
        newX = 30;
        x = newX;
        y = newY;
    }
}


public class FinalConstantsExample {
    public static void main(String[] args) {
        PointWithConstants point = new PointWithConstants(33, 44);
        point.changePosition(55, 66);
        System.out.println("x: " + point.x + " y: " + point.y);
    }
}
