package com.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Olek");

        // [Rafał, Adam, Ola, Olek]
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeLast();
        list.removeFirst();
        //[Adam, Ola]
        System.out.println(list);

        System.out.println(list.contains(p1));

        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");
        // [Adam, Daniel, Kuba, Ola]
        System.out.println(list);

        list.add(2, "Zenon");
        list.set(0, "Katarzyna");
        System.out.println(list);

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            String str = iterator.previous();
            System.out.println(str);
        }


    }
}
