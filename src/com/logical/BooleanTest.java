package com.logical;

public class BooleanTest {

	public static void main(String[] args) {
		boolean b;
		b=false;
	//	b='G';
		System.out.println(" b is: "+b);
		b=true;
		System.out.println(" b is :"+b);
		// true false  
//Java has a primitive type called boolean.class it can have 
//only two possible values true or false
		if(b)System.out.println("This is executed");
		b =false;
		if(b)System.out.println("This is executed");
		System.out.println(" 10>9 is: "+(10>9));  //( )
		if(10>9) {
			System.out.println("10>9");
			b=true;
		}
		if(b==true) {
			System.out.println("true");
		}
	}

}
