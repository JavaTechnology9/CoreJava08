package com.logical.Inheritance.OOPS;

public class Logical4 {
	public static void printValue(int i, int j, int k) {
		System.out.println("int");
	}
	public static void printValue(byte...b) {
		System.out.println("long");
	}
	public static void main(String...args) {
		byte b=9;
		printValue(b,b,b);
	}

}
