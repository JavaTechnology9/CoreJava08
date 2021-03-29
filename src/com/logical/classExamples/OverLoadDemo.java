package com.logical.classExamples;

public class OverLoadDemo {
	void test() {
		System.out.println("No Parameters");
	}
	void test(int a) {
		System.out.println("A value:"+a);
	}
	
	void test(int a, int b) {
		System.out.println("A and B values:"+a+" "+b);
	}
	void test(double a) {
		System.out.println("Double A value:"+a);
	}
	void test(int a, double b) {
		System.out.println("int a and double b"+a+" "+b);
	}
	void test(double a, int b) {
		System.out.println("double a and int b"+a+" "+b);
	}

}
