package com.logical.Inheritance.OOPS;

public class ReturnType {
	public static  void show(int a) {
		System.out.println("show(int a) method");
	}
	public static void show() {
		System.out.println("show() method");
	}
	public static void show(int a, int b) {
		System.out.println("show(int a, int b) method");
	}
	public static void show(double a) {
		System.out.println("show(double a) method");
	}
	public static void main(String[] args) {
		show();
		show(10);
		show(10,20);
		show(45.23);
		//show('M');
		
		
	}

}
