package com.sunbeam;

public class Main {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
//		l.addAtPosition(10, 1);
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addLast(60);
		l.addAtPosition(50, 8);
		l.fDisplay();
//		l.deleteFirst();
//		l.deleteLast();
		l.deleteAtPosition(6);
		System.out.println();
		l.fDisplay();
		//l.rDisplay();
	}
}
