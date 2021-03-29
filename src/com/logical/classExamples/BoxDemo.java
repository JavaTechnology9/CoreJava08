package com.logical.classExamples;

public class BoxDemo {

	public static void main(String[] args) {
		Box box=new Box();
		
		Box box1=new Box(245.0);
		Box box2=new Box(245.0,456.0);
		Box box3=new Box(245.0,478.0,369.0);
		Box box4=new Box(box3);
		
		System.out.println(box.volume());
		System.out.println(box1.volume());
		System.out.println(box2.volume());
		System.out.println(box3.volume());
		System.out.println(box4.volume());

	}

}
