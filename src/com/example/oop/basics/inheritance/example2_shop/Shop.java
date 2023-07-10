package com.example.oop.basics.inheritance.example2_shop;

/*
    klasa Shop
    klasa Product (zmienne: price, name, manufacturer, productionYear)
        klasa Mouse extends Product (zmienna: numButtons = 3)
            klasa VerticalMouse extends Mouse (zmienne - )
        klasa Monitor extends Product (zmienna: resolution = 1080)
        klasa Keyboard extends Product (zmienna: numKeys = 104)
        klasa Computer extends Product (zmienna: Mouse, Monitor, Keyboard)

    dodajemy pusty konstruktor do każdej klasy, w konstruktorze zmienne ustawiamy
    Tworzymy egzemplarze klas w metodzie main
    Każda klasa w oddzielnym pliku, wewnatrz pakietu exmaple2_shop
 */

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        VerticalMouse mouse2 = new VerticalMouse();
        Computer computer = new Computer();

        mouse.getPrice();

    }
}
