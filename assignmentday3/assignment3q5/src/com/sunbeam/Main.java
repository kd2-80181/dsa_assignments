package com.sunbeam;

public class Main {
	public static void main(String[] args) {
		int arr[] = {10 , 20 ,30 ,40,50};
		
		Stack st = new Stack(5);
		
		System.out.println("\nBefore using stack to reverse array i :");
		
		for (int ele : arr) {
			st.push(ele);
			System.out.println(ele + "  ");
		}
		
		for (int i = 0; i< 5; i++) {
			arr[i] =st.pop();
		}
		
		System.out.println("\nAfter using stack reverse array");
		for (int ele : arr) {
			System.out.println(ele + "   ");
		}
 	}

}
