import java.util.Scanner;

public class PrefixEvaluation {
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		}
		return 0;
	}
	
	public static int prefixEvaluation(String expr) {
		Stack stk = new Stack(expr.length());
		for(int i = expr.length()-1 ; i >= 0 ; i--) {	
			char ch = expr.charAt(i);			
			if(Character.isDigit(ch)) {
				stk.push(ch - '0');
			} else {
				int op1 = stk.pop();
				int op2 = stk.pop();
				
				int res = calculate(op1, ch, op2);
				stk.push(res);
			}
		}
		if(!stk.isEmpty())
			return stk.pop();
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Expression : ");
		String exp = scan.next();
		//String exp = "-++4/*56397";
		
		int result = prefixEvaluation(exp);
		System.out.println("Result is : " + result);
		
		scan.close();

	}

}
