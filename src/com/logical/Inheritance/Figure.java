package com.logical.Inheritance;

public abstract class Figure {
	double dim1;
	double dim2;
	
	public Figure(double a, double b) {
	dim1=a;
	dim2=b;
	
	}
	final void finalMethod() {
		System.out.println("This is final method");
	}
	abstract double area();
	/*double area() {
		System.out.println(" Area for Figure is undefined");
		return 0;
	}*/

}
