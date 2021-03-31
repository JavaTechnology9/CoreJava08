package com.logical.classExamples;

public class StaticDemo {
	static int a = 42;
	static int b = 99;
	 int FINAL_VARIABLE_A=10;
	final int FINAL_VARIABLE_B=20;
	static final int FINAL_VARIABLE_C=30;

	static void callme() {
		System.out.println("a value: " + a);
		//FINAL_VARIABLE_C=45;
	}
	void setVariable(int x) {
		FINAL_VARIABLE_A=x;
	}

	public static void main(String[] args) {
		StaticDemo demo=new StaticDemo();
		demo.setVariable(47);
		System.out.println(demo.FINAL_VARIABLE_A);
		//StaticDemo.callme();
		//System.out.println("b= " + StaticDemo.b);
		//System.out.println(StaticDemo.FINAL_VARIABLE_C);

	}
}
