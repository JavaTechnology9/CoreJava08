package com.logical.Inheritance.OOPS;

public class LogicalB extends LogicalA{
	int i=12;
	public void printName() {
		System.out.println("PrintName Child"+i);
	}

	public static void main(String[] args) {
		LogicalA a =new LogicalB();
		a.printName();
		System.out.println(a.i);

	}

}
