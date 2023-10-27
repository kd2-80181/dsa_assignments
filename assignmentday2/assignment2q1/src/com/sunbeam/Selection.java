package com.sunbeam;

import java.util.Arrays;

public class Selection {

	public static void selectionSort(int arr[] , int n) {
		
		for (int i= 0; i < n -1; i++) {
			for (int j=i+1; j<n; j++) {
				if(arr[i]> arr[j]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				}	
			}
			
		}
		
	}
	public static void main(String[] args) {
		int arr [] = {55 , 44 , 66 , 33 , 11 , 22};
		
		System.out.println("before sort :" + Arrays.toString(arr));
		
		selectionSort(arr, arr.length);
		
		System.out.println("After sort :" + Arrays.toString(arr));
		
 	}
	
	
}
