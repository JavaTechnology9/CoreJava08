package com.logical.classExamples;

public class AccessTest {

	public static void main(String[] args) {
		PubPrivate pp=new PubPrivate();
		pp.a=10;
		pp.b=20;
		//pp.c=30;
		pp.d=40;
		pp.setC(30);
		System.out.println(pp.getC());
		System.out.println(pp.a);
		System.out.println(pp.b);
		System.out.println(pp.d);

	}

}
