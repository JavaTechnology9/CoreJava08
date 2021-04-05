package com.logical.Inheritance;

public class FindArea {

	public static void main(String[] args) {
		//Figure f = new Figure(10, 20);
		Rectangle re = new Rectangle(100, 200);
		Triangle tr = new Triangle(150, 250);
		Figure fi;
		//fi = f;
		//System.out.println("Area is:" + fi.area());
		fi = re;
		System.out.println("Area is:" + fi.area());
		fi = tr;
		System.out.println("Area is:" + fi.area());
	}

}
