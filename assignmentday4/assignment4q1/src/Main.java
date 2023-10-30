
public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		
		list.display();
		
		list.delFirst();
		list.delLast();
		
		list.display();

		
		
	}
}
