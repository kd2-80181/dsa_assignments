package com.sunbeam;

public class Circular {
	private int arr[];
	private int rear , front;
	private final int SIZE;
	int counter;
	
	public Circular(int size) {
		 SIZE = size;
		 arr = new int [size];
		 front = -1;
		 rear = -1;
		 counter = 0;
	}
	
	public void push(int data) {
		rear = (rear + 1)% SIZE;
		arr[rear ] =data;
	}
	
	public void pop() {
		front = (front + 1)% SIZE;
		if (front == rear) {
			front = rear = -1;
			counter--;
		}
	}	
		public int peek() {
			return arr[(front + 1) % SIZE];
		
	}
		public boolean isFull() {
			return (counter == SIZE-1); 
		}
		
		public boolean isEmpty() {
			return (counter ==0);
		}
	

}
