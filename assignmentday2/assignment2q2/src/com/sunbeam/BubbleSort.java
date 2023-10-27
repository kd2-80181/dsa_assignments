package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[] , int n) {
		 int count =0;
		 int passes = 0;
		 int flag;
		for (int i=1; i < n; i++) {
			passes++;
			flag = 0;
			for(int j=0; j<n-i; j++) {
				count++;
				if(arr[j] > arr[j+ 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag =1;
				}
				
			}
			if(flag == 0)
				break;
		}
		System.out.println("comparisons ="+ count);
		System.out.println("passes =" + passes);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr [] = {55 , 33 , 66 , 11 , 22 , 44 , 88 , 77};
		//int arr [] = {11 , 22 , 33 , 44 , 55 , 66 , 77 , 88};
		System.out.println("Before sort :" + Arrays.toString(arr));
		bubbleSort(arr , arr.length);
		System.out.println("after sort :"+ Arrays.toString(arr));
	}

}
