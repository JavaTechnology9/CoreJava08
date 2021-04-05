package com.logical.Inheritance;

public class A {
	int i;
	private int j;
	void setIJ(int x, int y) {
		i=x;
		j=y;
	}
	int getI() {
		return i;
	}
	int getJ() {
		return j;
	}
	void showIJ() {
		System.out.println("i and j values: "+i+" "+j);
	}

}
