package com.logical.classExamples;

public class VarArgs {
	static void vaTest(String msg,int ...v) {
		System.out.println(msg+" "+"Number of args: "+v.length);
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	static void vaTest(boolean ...b) {
		System.out.println("Number of args: "+b.length);
		for(boolean x:b)
			System.out.print(x+" ");
		System.out.println();
		
	}
	public static void main(String[] args) {
		vaTest("One Parameter",10);
		vaTest("Five Parameter",10,20,30,45,78);
		vaTest("Three Parameter",10,20,30);
		vaTest("Four Parameter",10,20,30,45);
		vaTest(true,false,false,true);
		vaTest(true,false,false,true,false);
		vaTest(true,false,false);
		vaTest(true,false);
	}
	

}
