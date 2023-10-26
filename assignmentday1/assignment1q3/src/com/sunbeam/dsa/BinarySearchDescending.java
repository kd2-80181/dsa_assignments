//3. Implement binary search algorithm if array is sorted in descending order.

package com.sunbeam.dsa;

public class BinarySearchDescending {
    public static int binarySearchDescending(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // If the key is found, return the index
            if (arr[mid] == key) {
                return mid;
            }
            // If the key is smaller than the middle element, search the left half
            else if (arr[mid] < key) {
                right = mid - 1;
            }
            // If the key is larger than the middle element, search the right half
            else {
                left = mid + 1;
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {20, 15, 10, 7, 5, 3, 2, 1};
        int key = 7;
        int result = binarySearchDescending(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
