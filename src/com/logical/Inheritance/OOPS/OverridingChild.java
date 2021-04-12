package com.logical.Inheritance.OOPS;

public class OverridingChild extends OverridingParent{
	protected  void show() {
		System.out.println(" Child show()");
	}
	static  void m1() {
		System.out.println("Child static m1 ()");
	}
	public static void main(String[] args) {
		OverridingParent parent=new OverridingParent();
		//parent.show();
		
		OverridingChild obj=new OverridingChild();
		obj.show();
		OverridingParent.m1();
	}

}
