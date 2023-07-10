package com.example.threads.lifecycle;

class SomeThread implements Runnable {
    public static synchronized void test() {
        while (true) {

        }
    }
    @Override
    public void run() {
        test();
    }
}
public class BlockedState {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());

        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        System.out.println("Thread1 state: " + thread1.getState());
        System.out.println("Thread2 state: " + thread2.getState());

    }
}
