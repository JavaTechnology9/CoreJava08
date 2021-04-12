package com.logical.Inheritance.OOPS;

public class Logical6 {
	public static void main(String[] args) {
		int x=6;
		Logical6 l6=new Logical6();
		l6.doStuff(x);
		System.out.println(" x value:"+x);
	}

	private void doStuff(int x) {
		System.out.print("doStuff: "+x++);
		System.out.println(x);
	}

}
