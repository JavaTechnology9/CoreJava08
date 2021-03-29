package com.logical.classExamples;

public class StackDemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		for(int i=0;i<st.st.length;i++) {
			st.push(i+2);// calling the method
		}
		for(int i=0;i<st.st.length;i++) {
			System.out.print(st.pop()+" ");
		}
		

	}

}
