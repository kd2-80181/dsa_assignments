import java.util.Scanner;

public class TestPriority {
	
	public static int operatorsPriority(String opr) {
		int result =0;
		switch(opr) {
		
		case "/":
			result=4;
			break;
		case "*":
		     result = 3;
		     break;
		     
		case "+":
			result=2;
			
		case "-":
			result = 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String opr;
		int priority;
		System.out.println("enter priority to find it");
		
		opr = sc.next();
		priority = operatorsPriority(opr);
		if(priority > 0) {
			System.out.println("priority is : "+ priority);
		}
	}

}
