package com.logical.Inheritance.OOPS;

public class Logical2 {
	/*int _$;
	int $7;
	
	//int do;
	public static void main(String[] args) {
		Logical2 test=new Logical2();
		test.$7=10;
		test._$=20;
		//test.do=30;
		System.out.println(test.$7);
		System.out.println(test._$);
		//System.out.println(test.do);
	}*/
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	public Logical2() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		Logical2 l2=new Logical2();
	}

}
