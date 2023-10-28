
public class InfixToPostfix {
	public static int priority(char ch) {
		int priority = 0;
		switch (ch) {
		case '$':
			priority = 4;
			break;
		case '/':
			priority = 3;
			break;
		case '*':
			priority = 2;
			break;
		case '+':
			priority = 1;
			break;
		case '-':
			priority = 1;
			break;
		}
		return priority;
	}

	public static String infixToPostfix(String exprs) {
		StringBuilder str = new StringBuilder();
		Stack stk = new Stack(exprs.length());
		for (int i = 0; i < exprs.length(); i++) {
			char ch = exprs.charAt(i);

			if (Character.isDigit(ch))
				str.append((char)ch);
			else if (ch == '(')
				stk.push(ch);
			else if (ch == ')') {
				while (stk.peek() != '(')
					str.append((char)stk.pop());
				stk.pop();
			}
			else {
				while (!stk.isEmpty() && priority((char) stk.peek()) >= priority(ch)) {
					str.append((char)stk.pop());
				}
				stk.push(ch);
			}
		}
		while(!stk.isEmpty()) 
			str.append((char)stk.pop());
		return str.toString();
	}

	public static void main(String[] args) {
		String exprs = "1$9+3*4-(6+8/2)+7";
		
		String result = infixToPostfix(exprs);
		System.out.println("Postfix Expression is : " + result);
	}
}
