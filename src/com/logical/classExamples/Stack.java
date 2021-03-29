package com.logical.classExamples;

public class Stack {
	int st[]=new int[10];//10
	int tos;
	public Stack() {
		tos=-1;
	}
	 void push(int item) {// called 
		 if(tos==9)
			 System.out.println("Stack is full");
		 else 
			 st[++tos]=item;
	 }
	 int pop() {
		 if(tos<0) {
			 System.out.println("Stack is empty");
			 return 0;
		 }else
			 return st[tos--];
		 
	 }

	

}
