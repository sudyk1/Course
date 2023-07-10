package com.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class ReturnOdd {

    public static void main(String[] args) {
        int[] arr1 = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}; // 5
        int[] arr2 = new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}; // -1
        int[] arr3 = new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}; // 5
        int[] arr4 = new int[]{10}; // 10
        int[] arr5 = new int[]{1,1,1,1,1,1,10,1,1,1,1}; // 10
        int[] arr6 = new int[]{5,4,3,2,1,5,4,3,2,10,10}; // 1
        int[] arr7 = new int[]{10, 10}; // 10

//        System.out.println("Powinno wyjsc: " + 5 + "| Wyszło: " + findIt(arr1));
//        System.out.println("Powinno wyjsc: " + -1 + "| Wyszło: " + findIt(arr2));
//        System.out.println("Powinno wyjsc: " + 5 + "| Wyszło: " + findIt(arr3));
//        System.out.println("Powinno wyjsc: " + 10 + "| Wyszło: " + findIt(arr4));
//        System.out.println("Powinno wyjsc: " + 10 + "| Wyszło: " + findIt(arr5));
//        System.out.println("Powinno wyjsc: " + 1 + "| Wyszło: " + findIt(arr6));
        System.out.println("Powinno wyjsc: " + 1 + "| Wyszło: " + findIt(arr7));
    }

//    public static int findIt(int[] a) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i : a) {
//            arrayList.add(i);
//        }
//        Set<Integer> numbers = new HashSet<>(arrayList);
//        for (int i : numbers) {
//            if (Collections.frequency(arrayList, i) % 2 == 1) {
//                return i;
//            };
//        }
//        return 9999;
//    }

    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("XOR => " + Integer.toBinaryString(xor));
            System.out.println("A[i] => " + Integer.toBinaryString(A[i]));
            xor ^= A[i];
        }
        System.out.println("Koncowe XOR => " + Integer.toBinaryString(xor));
        return xor;
    }

}
