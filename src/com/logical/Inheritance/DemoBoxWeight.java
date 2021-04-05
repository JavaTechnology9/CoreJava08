package com.logical.Inheritance;

public class DemoBoxWeight {

	public static void main(String[] args) {
		BoxWeight myBox1=new BoxWeight(10, 20, 30, 40);
		Box box=new Box();
		//BoxWeight myBox2=new BoxWeight(100, 200, 300, 400);
		double vol;
		vol=myBox1.volume();
		System.out.println(" volume of box1: "+vol);
		System.out.println("weight of the box1:"+myBox1.weight);
		box=myBox1;
		
		vol=box.volume();
		System.out.println(" volume of box2: "+vol);
		//System.out.println("weight of the box2:"+box.weight);
		
		/*ColorBox myBox1=new ColorBox(10, 20, 30, 40);
		ColorBox myBox2=new ColorBox(100, 200, 300, 400);
		
		System.out.println(" volume of box1: "+myBox1.volume());
		System.out.println("color of the box1:"+myBox1.color);
		
		//vol=myBox2.volume();
		System.out.println(" volume of box2: "+myBox2.volume());
		System.out.println("color of the box2:"+myBox2.color);*/

	}

}
