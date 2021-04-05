package com.logical.Inheritance;

public class Rectangle extends Figure {
	public Rectangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("Inside Area for Rectangle");
		return dim1*dim2;
	}
	 /*void finalMethod() {
		System.out.println("This is final method");
	}*/

}
