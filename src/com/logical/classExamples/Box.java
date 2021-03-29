package com.logical.classExamples;

public class Box {
	double w;
	double h;
	double d;
	
	/*void volume() {
		System.out.print("Volume is: ");
		System.out.println(width*height*depth);
	}*/
	public Box(Box box) {
		w=box.w;
		h=box.h;
		d=box.d;
	}
	public Box(){
		w=-1;
		h=-2;
		d=-3;
	}
	public Box(double len) {
		w=h=d=len;
	}
	public Box(double w, double h,double d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public Box(double le, double lm) {
		this.w=le;
		this.h=lm;
		this.d=le+lm;
	}

	double volume() {
		System.out.print("Volume is: ");
		return w*h*d;
	}
	void setVolume(double w,double h,double d) {
		w=w;
		h=h;
		d=d;
	}
	
	public static void main(String[] args) {
		Box bo;// Declaring the object
	//	bo=new Box();// allocate a box object
		double vol;
		Box box=new Box(10,25,35);
		Box box1=new Box();
		bo=box1;
		
		/*box.width=10;
		box.height=20;
		box.depth=15;
		
		box1.width=3;
		box1.height=6;
		box1.depth=9;*/
		box.setVolume(10, 20, 15);
		box1.setVolume(3, 6, 9);
		//bo.setVolume(w, h, d);
		
		/*System.out.println(box.width);
		System.out.println(box.height);
		System.out.println(box.depth);
		System.out.println("===========");
		System.out.println(box1.width);
		System.out.println(box1.height);
		System.out.println(box1.depth);*/
		vol=box.volume();
		System.out.println(vol);
		vol=box1.volume();
		System.out.println(vol);
		vol=bo.volume();
		System.out.println(vol);
		/*box=null;
		System.out.println(box.width);*/
		//vol=box.width*box.height*box.depth;
		//System.out.println("volume of box:"+vol);
		
		//vol=box1.width*box1.height*box1.depth;
		//System.out.println("volume of box:"+vol);
		/*bo.width=200;
		System.out.println(bo.width);
		System.out.println(box1.width);*/
	}

}
