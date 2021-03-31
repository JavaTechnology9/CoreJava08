package com.logical.classExamples;

public class Outer {
	private int outer_x=100;
	 static int b=20;
	 final int c=30;
	
	void test() {
		Inner inner=new Inner();
		inner.display();
	}
	static class Inner{
		int y=10;
		static void display() {
			//System.out.println("display: outer_x=: "+outer_x);
			System.out.println(b);
			//System.out.println(c);
		}
	}
	void showY() {
		//System.out.println(y);
	}

}
