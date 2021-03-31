package com.logical.classExamples;

public class UseStatic {
	public static int a=3;
	public static int b;
	public int c;
	static void meth(int x) {
		System.out.println("X value: "+x);
		System.out.println("A value: "+a);
		System.out.println("B value: "+b);
		//System.out.println(c);
		//test();
	}
	
	void test() {
		System.out.println("Test method");
		System.out.println(c);
		System.out.println("A value: "+a);
		System.out.println("B value: "+b);
		this.meth(10);
	}
	static {
		System.out.println("Static block is initialized.");
		b=a*4;
	}
	
}
