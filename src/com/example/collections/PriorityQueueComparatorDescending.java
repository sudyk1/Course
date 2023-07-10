package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

// Kolejność malejąca
class DescengingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) return 0;
        if (x > y)
            return -1;
        else
            return 1;
    }
}

public class PriorityQueueComparatorDescending {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>(new DescengingComparator());
        test.add(99);
        test.add(56);
        test.add(88);
        test.add(14);

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
