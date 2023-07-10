package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparatorAscending implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class StringLengthComparatorDescending implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}


public class PriorityQueueComparatorStringLength {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new StringLengthComparatorDescending());
        queue.add("Daniel");
        queue.add("Ola");
        queue.add("Zuzanna");
        queue.add("Adam");
        queue.add("Kasia");
        queue.add("Kokweokwoeksder");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
