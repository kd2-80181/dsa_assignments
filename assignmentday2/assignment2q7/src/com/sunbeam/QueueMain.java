package com.sunbeam;

import java.util.Scanner;

public class QueueMain {
	public static void main(String [] ergs) {
		
		Queue q = new Queue(4);
		
		int choice ;
		Scanner sc = new Scanner (System.in);
		do{
			System.out.println("-----------------------------------");
			System.out.println("0.Exit");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("-------------------------------------");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				if(q.isFull()) {
					System.out.println("queue is full");
				}else {
					System.out.println("enter data");
					int data = sc.nextInt();
					q.push(data);
				}
					
				
				break;
			
			case 2:
				if (q.isEmpty()) {
					System.out.println("is empty");
				}else {
					q.pop();
				}
				
			    break;
			 
			case 3: if(q.isEmpty()) {
				System.out.println("queue is empty");
			}else {
				System.out.println(("peeked data :" + q.peek()));
			}
				break;
			}
		}while (choice != 0);
		
		sc.close();
	}

}
