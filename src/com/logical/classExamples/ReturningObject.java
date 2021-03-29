package com.logical.classExamples;

public class ReturningObject {
	int a;

	public ReturningObject() {
		// TODO Auto-generated constructor stub
	}
	public ReturningObject(int i) {
		a=i;
	}
	ReturningObject inbyTen() {
		ReturningObject object =new ReturningObject(a+10);
		return object;
		
	}
	public static void main(String[] args) {
		ReturningObject object =new ReturningObject(10);
		ReturningObject object1;
		object1=object.inbyTen();
		System.out.println(object1.a);
	}

}
