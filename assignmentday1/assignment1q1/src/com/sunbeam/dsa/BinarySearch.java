//1. Write a program to print no of comparisions done to search a key in
//	i. linear search
//	ii. binary serach 
	
package com.sunbeam.dsa;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int comparisons = 0;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return comparisons;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return comparisons;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 9};
        int key = 7;
        int comparisons = binarySearch(arr, key);
        System.out.println("Binary Search: Comparisons: " + comparisons);
    }
}


