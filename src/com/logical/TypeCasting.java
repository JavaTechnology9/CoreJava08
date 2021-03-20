package com.logical;

public class TypeCasting {
	public static void main(String[] args) {
		/*byte b;
		int i=257;
		double d=323.42;
		System.out.println("type conversion");
		b=(byte)i;
		System.out.println("Byte value"+b);
		i=(int)d;
		System.out.println("int value:"+i);
		b=(byte)d;
		System.out.println(b);*/
		/*int a=40;
		byte b=50;
		int c=a*b;
		
		byte d=25;
		int e=d*2;*/
		
		byte b=42;
		char c='a';
		short t=1024;
		int i=5000;
		float f=5.65f;
		double d=.1234;
		double result=(f*b)+(i/c)-(d*t);
		System.out.println(result);
	}

}
