package com.logical.classExamples;

public class CallbyValue {
	int a, b;
	public CallbyValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void meth(int i, int j) {
		i*=2;
		j/=2;
	}
	void meth(CallbyValue value) {
		value.a*=2;
		value.b/=2;
		
	}
	public static void main(String[] args) {
		CallbyValue  value=new CallbyValue(15,20);
		//int a=15, b=20;
		System.out.println(" a and b values before call methd method: " +value.a+" "+value.b);
		value.meth(value);
		System.out.println(" a and b values after calling methd method: " +value.a+" "+value.b);
	}

}
