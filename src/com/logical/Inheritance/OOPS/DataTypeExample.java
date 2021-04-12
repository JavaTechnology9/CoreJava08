package com.logical.Inheritance.OOPS;

public class DataTypeExample {
	public void show(int x) {
		System.out.println(" int x value:"+x);
	}
	public void show(String x) {
		System.out.println(" String x value:"+x);
	}
	public void show(byte x) {
		System.out.println(" byte x value:"+x);
	}
	
	public static void main(String[] args) {
		byte a=25;
		DataTypeExample ex=new DataTypeExample();
		ex.show(a);// 4
		ex.show("hello");//7
		ex.show(250); //4
		ex.show('A');//4
		ex.show("A");// 7
		//ex.show(7.5);
	}

}
