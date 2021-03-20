package com.logical;

public class IncrementOP2 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c;
		int d;
		c=++b;
		d=a++;
		c++;
		System.out.println(c);
		d=++c;
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		System.out.println("c value:"+c);
		System.out.println("d value:"+d--);
		System.out.println("d value:"+--d);

	}

}
