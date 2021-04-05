package com.logical.Inheritance;

public class BB extends AA{
	int i;
	public BB(int a, int b) {
		super.i=a;
		i=b;
	}
	void show() {
		super.show();
		System.out.println("i in super-class :"+super.i);
		System.out.println("i in sub-class: "+ i);
	}
	public static void main(String[] args) {
		BB bb=new BB(10,20);
		bb.show();
		
		AA aa=new AA();
		aa.i=10;
		aa.show();
	}

}
