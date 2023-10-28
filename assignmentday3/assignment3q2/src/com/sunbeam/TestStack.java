package com.sunbeam;

public class TestStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack st=new Stack(5);
   st.push(10);
   st.push(20);
   st.push(50);
   st.push(30);
   st.push(5);
   
   System.out.println("Maximunm element in stack is: "+st.peek());
   

	}

}
