package com.example.oop.basics.inner_class;

class SomeExample {
    private class PrivClass {
        public void printInfo() {
            System.out.println("Message from private inner class");
        }
    }
    public void run() {
        PrivClass pc = new PrivClass();
        pc.printInfo();

        class InnerClass  {
            public void printInfo() {
                System.out.println("InnerClass");
            }
        }

        InnerClass ic = new InnerClass();
        ic.printInfo();
    }

    public class PubClass {
        public void printInfo() {
            System.out.println("PubClass!");
        }
    }


}


public class Example {
    public static void main(String[] args) {
        SomeExample someExample = new SomeExample();
        someExample.run();

        SomeExample.PubClass innerPub = someExample.new PubClass();
        innerPub.printInfo();
    }

}
