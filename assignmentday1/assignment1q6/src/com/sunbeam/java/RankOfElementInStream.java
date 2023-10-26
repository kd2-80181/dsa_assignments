package com.sunbeam.java;

import java.util.TreeMap;

public class RankOfElementInStream {
    public static void findRank(int[] arr, int element) {
        TreeMap<Integer, Integer> rankMap = new TreeMap<>();
        int rank = 1;

        for (int num : arr) {
            rankMap.put(num, rankMap.getOrDefault(num, 0) + 1);
            if (num == element) {
                System.out.println("Rank of " + element + " is: " + rank);
                return;
            }
            rank += rankMap.get(num);
        }

        System.out.println("Element " + element + " not found in the stream.");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 3, 4, 4, 1};
        int elementToFind = 4;
        findRank(arr, elementToFind);
    }
}
