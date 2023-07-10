package com.example.oop.basics.exeptions;

public class ExeptionBasics {
    public static void main(String[] args) {

        int[] numArr = {1, 1, 2, 3, 0, 5};
        try {
            for (int i = 0; i < numArr.length; i++) {
                System.out.println(numArr[i]);
                numArr[i] = numArr[i] / numArr[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Array!");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exepiton!");
            e.printStackTrace();
        } finally {
            System.out.println("Program executed.");
        }


        for (int i : numArr) {
            System.out.println(i);
        }


    }
}
