
public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node head;
	private int max,min;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;	
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(isEmpty())
			head = newNode;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	public void delFirst() {
		if (isEmpty())
			System.out.println("List is Empty");
		else {
			head = head.next;
		}
	}

	public void delLast() {
		if (isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}

	public void display() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}

	public int getMaxElement() {
		Node trav = head;
		max = head.data;
		while(trav.next != null) {
			trav = trav.next;
			if(max < trav.data)
				max = trav.data;
		}
		return max;
	}

	public int getMinElement() {
		Node trav = head;
		min = head.data;
		while(trav.next != null) {
			trav = trav.next;
			if(min > trav.data)
				min = trav.data;
		}
		return min;
	}
}
