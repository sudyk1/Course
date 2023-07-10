package com.example.threads;

class TestNewThread extends Thread {
    private int sleepTime;

    public TestNewThread(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Wątek " + this.getName() + ", wartość i: " + i);
            try {
                this.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadExtendExample {
    public static void main(String[] args) {
        TestNewThread thread1 = new TestNewThread("thread1", 1000);
        thread1.start();
        TestNewThread thread2 = new TestNewThread("thread2", 700);
        thread2.start();
    }
}
