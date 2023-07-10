package com.example.basics.date;

import java.util.Arrays;
import java.util.Date;

public class CodeTime {
    public static void main(String[] args) {
        long createT1 = System.currentTimeMillis();
        int[] arr = creatArray(1000000);
        long createT2 = System.currentTimeMillis();
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        long timeElapsed = end - start;
        long createElapsed = createT2 - createT1;
        System.out.println("Create time elapsed: " + createElapsed + "ms ");
        System.out.println("Time elapsed: " + timeElapsed + "ms ");
    }


    public static int[] creatArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.random() * 10000;
        }
        return array;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void quickSort(int startIndex, int stopIndex, int[] table) {
        if (startIndex >= stopIndex) return;
        int pivot = table[stopIndex];

        int leftPointer = startIndex;
        int rightPointer = stopIndex;

        do {
            while (table[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (table[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }

            int temp = table[leftPointer];
            table[leftPointer] = table[rightPointer];
            table[rightPointer] = temp;

        } while ( leftPointer <  rightPointer);

        int temp2 = table[leftPointer];
        table[leftPointer] = pivot;
        table[stopIndex] = temp2;

        quickSort(startIndex, rightPointer - 1, table);
        quickSort(leftPointer + 1, stopIndex, table);
    }


}
