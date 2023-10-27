package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Descending {
	
	public static void insertionDesc(int arr [] , int n) {
		for (int i= 1; i<n; i++) {
			
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
				
			}
			arr[j+1] = temp;
			
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33 , 88 , 77};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionDesc(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
