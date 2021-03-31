package com.logical.classExamples;

public class Recursion {

	public static void main(String[] args) {
		/*Factorial fact=new Factorial();
		
		System.out.println("Factorial of 3 is: "+fact.fact(3));
		System.out.println("Factorial of 4 is: "+fact.fact(4));
		System.out.println("Factorial of 5 is: "+fact.fact(5));*/
		
		RecTest test=new RecTest(10);
		for(int i=0;i<10;i++)
			test.values[i]=i+2;
		test.printArray(10);

	}

}
