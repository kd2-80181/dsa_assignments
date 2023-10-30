
public class List {
	public class Node{
		
		private int data;
		private Node next;
		
			
	public Node (int value) {
		data = value;
		next = null;
		
	}
}
	private Node tail;
	
	public List() {
	     tail = null;	
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			newnode.next= newnode;
		}else {
			newnode.next = tail;
			Node trav = tail;
			while(trav.next != tail) {
				trav = trav.next;
				trav.next=newnode;
				tail = newnode;
			}
		}
		
		
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("Listb is empty");
		}else {
			tail.next = tail.next.next;
		}
		
	}
	
	public void displayList() {
		Node trav = tail;
		System.out.println("List :");
		
		while(trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}
	
}
