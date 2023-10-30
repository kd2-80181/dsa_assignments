
public class List {
	public class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			this.data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(isEmpty())
			head = newNode;
		else if(head.data > data) {
			newNode.next = head;
			head = newNode;
		}
			
		else {
			Node trav= head;
			while(trav.next != null) {
				if(trav.next.data >=  data)
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	
	public void delFirst() {
		if(isEmpty()) 
			System.out.println("List is Empty");
		else {
			head = head.next;
		}
	}
	
	public void delLast() {
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
}
