package com.logical.Inheritance;

public class Triangle extends Figure {
	public Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("Inside Area for Triangle");
		return dim1 * dim2 / 2;
	}

}
