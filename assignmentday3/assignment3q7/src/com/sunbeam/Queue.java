package com.sunbeam;

import java.util.Stack;

public class Queue {

	
	private int arr[];
	private int top;
	private final int SIZE;
	int max;
	
	public Queue (int size ) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
		
	}
	
	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top == -1;
		
	}
	public boolean isFull() {
		return top == SIZE - 1;
	}
	public int qPop(Queue s2) {
		int data = s2.pop();
		return data;
	}
	
}
