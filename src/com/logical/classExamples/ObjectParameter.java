package com.logical.classExamples;

public class ObjectParameter {
	int a, b;

	public ObjectParameter(int i, int j) {
		a = i;
		b = j;
	}
	public ObjectParameter() {
		// TODO Auto-generated constructor stub
	}

	boolean equals(ObjectParameter obj) {
		if(obj.a==a && obj.b==b) return true;
		else return false;
	}

	public static void main(String[] args) {
		ObjectParameter param1=new ObjectParameter(100,22);
		ObjectParameter param2=new ObjectParameter(100,22);
		ObjectParameter param3=new ObjectParameter(-1,22);
		System.out.println("param1==param2"+param1.equals(param2));
		System.out.println("param1==param2"+param1.equals(param3));
	}

}
