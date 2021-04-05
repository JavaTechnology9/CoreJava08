package com.logical.Inheritance;

public class MethodOverridingMain {

	public static void main(String[] args) {
		/*MethodOver2 ov=new MethodOver2(10, 20, 30);
		ov.show("This is K");
		ov.show();*/
		/*MethodOver1 ov2=new MethodOver1(10,200);
		ov2.show();*/
		
		RunTimeA timeA=new RunTimeA();
		RunTimeB timeB =new RunTimeB();
		RunTimeC timeC=new RunTimeC();
		RunTimeA r;
		r=timeA;
		r.callme();
		
		r=timeB;
		r.callme();
		
		r=timeC;
		r.callme();
	}

}
