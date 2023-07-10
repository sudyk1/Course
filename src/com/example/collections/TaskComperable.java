package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private int priority;
    private String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        int a = this.priority;
        int b = o.getPriority();

        if (a == b) return 0;

        if (a > b)
            return 1;
        else
            return -1;
    }
}

//Kolejność malejąca
class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int x = o1.getPriority();
        int y = o2.getPriority();
        if (x == y) return 0;

        if (x > 0)
            return -1;
        else
            return 1;
    }
}


public class TaskComperable {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task(1, "Shop"));
        tasks.add(new Task(3, "Homework"));
        tasks.add(new Task(7, "Cinema"));
        tasks.add(new Task(1, "Work"));

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }


        System.out.println("\n\n");
        tasks = new PriorityQueue<>(new TaskComparator());
        tasks.add(new Task(1, "Shop"));
        tasks.add(new Task(3, "Homework"));
        tasks.add(new Task(7, "Cinema"));
        tasks.add(new Task(1, "Work"));

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}
