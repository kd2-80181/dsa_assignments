package com.sunbeam.java;

public class LinearSearchNthOccurrence {
    public static int findNthOccurrence(int[] arr, int key, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                if (count == n) {
                    return i; 
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2, 7, 2, 8, 2};
        int key = 2;
        int n = 3;
        int index = findNthOccurrence(arr, key, n);
        if (index != -1) {
            System.out.println("The " + n + "th occurrence of element " + key + " is at index: " + index);
        } else {
            System.out.println("The " + n + "th occurrence of element " + key + " is not found in the array.");
        }
    }
}

