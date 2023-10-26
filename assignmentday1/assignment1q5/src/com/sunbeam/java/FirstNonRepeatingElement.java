package com.sunbeam.java;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static int findFirstNonRepeatingElement(int[] arr) {
        // Create a HashMap to store element counts
        Map<Integer, Integer> elementCounts = new HashMap<>();

        // Iterate through the array to count occurrences of each element
        for (int num : arr) {
            elementCounts.put(num, elementCounts.getOrDefault(num, 0) + 1);
        }

        // Iterate through the array again to find the first non-repeating element
        for (int num : arr) {
            if (elementCounts.get(num) == 1) {
                return num;
            }
        }

        // If no non-repeating element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        int firstNonRepeatingElement = findFirstNonRepeatingElement(arr);
        if (firstNonRepeatingElement != -1) {
            System.out.println("First non-repeating element is: " + firstNonRepeatingElement);
        } else {
            System.out.println("No non-repeating element found in the array.");
        }
    }
}

