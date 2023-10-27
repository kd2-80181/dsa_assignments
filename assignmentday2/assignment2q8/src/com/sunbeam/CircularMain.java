package com.sunbeam;

import java.util.Scanner;

public class CircularMain {
	
	public static void main(String[] args) {
		
	
	
	Circular c= new Circular(4);
	
	int choice;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("-----------------------------------");
		System.out.println("0.Exit");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("-------------------------------------");
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			if (c.isFull()) {
				System.out.println("queue is full");
			}else {
				System.out.println("enter data");
				int data = sc.nextInt();
				c.push(data);
			}
			break;
			
		case 2:
			if(c.isEmpty()) {
				System.out.println("queue is empty");
			}else {
				System.out.println("enter data");
				int data = sc.nextInt();
				c.pop();
			}
			break;
			
		case 3:if(c.isEmpty()) {
			System.out.println("queue is empty");
		}else {
			System.out.println("peeked data :" + c.peek());
		}
			break;
		}
	}while(choice != 0);
sc.close();
}
}