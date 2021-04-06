package com.logical.Inheritance;

public abstract class AbstractA {
	private int var;
	 int val_n=12;
	abstract void callme();
	
	void callmetoo() {
		System.out.println("This is a concrete method" + var);
	}
	public AbstractA() {
		var=10;
	}
	static{
		System.out.println("static block");
	}

}
