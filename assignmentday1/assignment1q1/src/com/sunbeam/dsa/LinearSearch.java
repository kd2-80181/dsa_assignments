//1. Write a program to print no of comparisions done to search a key in
//	i. linear search
//	ii. binary serach

package com.sunbeam.dsa;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == key) {
                return comparisons;
            }
        }
        return comparisons;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 7, 2, 9};
        int key = 7;
        int comparisons = linearSearch(arr, key);
        System.out.println("Linear Search: Comparisons: " + comparisons);
    }
}

