package com.logical.Inheritance;

public class B extends A{
	int k;
	void showK() {
		System.out.println(" K value: "+k);
	}
	void sum() {
		System.out.println("i+j+k :"+(i+getJ()+k));
	}
	void showIJ() {
		System.out.println("sub class i and j values: "+i+" "+getJ());
	}

}
