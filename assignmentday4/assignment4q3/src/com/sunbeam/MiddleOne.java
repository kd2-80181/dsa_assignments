package com.sunbeam;
class Node{
	  int data;
	  Node next;
	  
	  public Node (int data) {
		  this.data = data;
	  }
}

public class MiddleOne {
  
	private Node head;
	
	public void add(int data) {
		Node newnode = new Node(data);
		
		if(head == null) {
			head = newnode;
	}else {
		Node current = head;
		while(current.next != null) {
			current= current.next;
		}
		current.next=newnode;
	}
	
	}	
}
