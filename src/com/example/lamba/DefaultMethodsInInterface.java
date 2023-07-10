package com.example.lamba;

@FunctionalInterface
interface MathInterface {
    int operate(int a, int b);

    default int add(int a, int b) {
        return a + b;
    }

    default int subtract(int a, int b) {
        return a - b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

class MathClass implements MathInterface {
    @Override
    public int operate(int a, int b) {
        return 0;
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        MathInterface math = (a,b) -> a * b;

        System.out.println(math.operate(10,30)); // 300
        System.out.println(MathInterface.divide(40,2)); // 20


    }
}
