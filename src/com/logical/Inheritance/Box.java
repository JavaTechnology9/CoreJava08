package com.logical.Inheritance;

public class Box {
	private double width;
	private double height;
	private double depth;

	public Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	public Box(double w, double h, double d) {
		//this(w);
		System.out.println("Box parameter constructor:");
		this.width = w;
		this.height = h;
		this.depth = d;
	}

	public Box(Box obj) {
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}

	public Box(double len) {
		System.out.println("checking");
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}

}
