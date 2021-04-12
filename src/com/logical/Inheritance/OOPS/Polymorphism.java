package com.logical.Inheritance.OOPS;

public class Polymorphism {// compile time polymorphism
	public int sum(int x, int y) {
		return (x + y);
	}

	public int sum(int x, int y, int z) {
		return (x + y + z);
	}

	public double sum(double x, double y) {
		return (x + y);
	}

	public static void main(String[] args) {
		Polymorphism sim = new Polymorphism();
		System.out.println(sim.sum(10, 20));
		System.out.println(sim.sum(10, 20, 30));
		System.out.println(sim.sum(142.0, 123.0));
	}

}
