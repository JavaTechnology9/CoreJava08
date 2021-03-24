package com.logical.classExamples;

public class Box {
	double width;
	double height;
	double depth;
	
	/*void volume() {
		System.out.print("Volume is: ");
		System.out.println(width*height*depth);
	}*/
	double volume() {
		System.out.print("Volume is: ");
		return width*height*depth;
	}
	
	public static void main(String[] args) {
		Box bo;// Declaring the object
	//	bo=new Box();// allocate a box object
		double vol;
		Box box=new Box();
		Box box1=new Box();
		bo=box1;
		
		box.width=10;
		box.height=20;
		box.depth=15;
		
		box1.width=3;
		box1.height=6;
		box1.depth=9;
		
		System.out.println(box.width);
		System.out.println(box.height);
		System.out.println(box.depth);
		System.out.println("===========");
		System.out.println(box1.width);
		System.out.println(box1.height);
		System.out.println(box1.depth);
		vol=box.volume();
		System.out.println(vol);
		vol=box1.volume();
		System.out.println(vol);
		vol=bo.volume();
		System.out.println(vol);
		//vol=box.width*box.height*box.depth;
		//System.out.println("volume of box:"+vol);
		
		//vol=box1.width*box1.height*box1.depth;
		//System.out.println("volume of box:"+vol);
		bo.width=200;
		System.out.println(bo.width);
		System.out.println(box1.width);
	}

}
