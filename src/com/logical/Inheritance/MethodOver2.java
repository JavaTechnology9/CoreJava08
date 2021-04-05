package com.logical.Inheritance;

public class MethodOver2 extends MethodOver1 {
	int k;

	public MethodOver2(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	void show(String msg) {
		//super.show();
		System.out.println(msg + k);
	}

}
