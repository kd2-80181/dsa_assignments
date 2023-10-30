package com.sunbeam;

public class List {
	public class Node {
		private Employee data;
		private Node next;

		public Node(Employee value) {
			this.data = value;
			next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(Employee data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(Employee data) {
		Node newNode = new Node(data);
		if (isEmpty())
			head = newNode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	public void delete(int empid) {
		if (isEmpty())
			System.out.println("List is Empty");
		else if(head.data.getEmpid() == empid)
			head = head.next;
		else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.next.data.getEmpid() == empid)
					break;
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	public void display() {
		Node trav = head;
		System.out.println("\n-->List :");
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}

	public Employee search(int empid) {
		Node trav = head;
		while (trav.next != null) {
			if (trav.data.getEmpid() == empid)
				break;
			trav = trav.next;
		}
		return trav.data;
	}
	
	public void update(int empid, double sal) {
		Node trav = head;
		while(trav.next != null) {
			if(trav.data.getEmpid() == empid)
				break;
			trav = trav.next;
		}
		trav.data.setSalary(sal);
	}
}