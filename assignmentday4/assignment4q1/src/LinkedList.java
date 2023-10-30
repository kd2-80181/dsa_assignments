
public class LinkedList {
	public class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	private Node head;
	private Node tail;

	public LinkedList() {
		head = tail = null;
	}
	//isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	//Add first
	public void addFirst(int data) {
		Node node = new Node(data);
		if(isEmpty()) 
			head = tail = node;
		else {
			node.next = head;
			head = node;
		}	
	}
	//add Last 
	public void addLast(int data) {
		Node node = new Node(data);
		if(isEmpty())
			head = node;
		else {
			tail.next = node;
			tail = node;
		}
	}
	//delete first
	public void delFirst() {
		if(isEmpty())
			System.out.println("List is Empty");
		else if(head == tail)
			head = tail = null;
		else
			head = head.next;
	}
	//Delete last
	public void delLast() {
		if(isEmpty())
			System.out.println("List is Empty");
		else if(head == tail)
			head = tail = null;
		else {
			Node trav = head;
			while(trav.next != tail) 
				trav = trav.next;
			trav.next = null;
			tail = trav;
		}
	}
	//Display
	public void display() {
		if(isEmpty())
			System.out.println("List is Empty!!");
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
