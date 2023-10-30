
public class Main {
	public static void main(String[] args) {
		List list = new List();
		
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(25);
		list.addLast(15);
		list.addLast(5);
		
		list.display();
		System.out.println(" ");
		int max = list.getMaxElement();
		int min = list.getMinElement();
		System.out.println("Max element in the Linked List is : " + max);
		System.out.println("Min element in the Linked List is : " + min);
		

	}
	
}
