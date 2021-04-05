package com.logical.Inheritance;

public class SimpleInheritance {

	public static void main(String[] args) {
		A superOb=new A();
		B subOb=new B();
		superOb.setIJ(10, 20);
		superOb.showIJ();
		//superOb.showK();
		//superOb.k=30;
		subOb.setIJ(30, 40);
		subOb.k=50;
		subOb.showIJ();
		subOb.showK();
		
		//superOb.sum();
		subOb.sum();

	}

}
