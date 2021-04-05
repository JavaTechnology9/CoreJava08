package com.logical.Inheritance;

public class DemoShipment {

	public static void main(String[] args) {
		/*Shipment sh1=new Shipment();
		System.out.println(sh1.cost);
		System.out.println(sh1.weight);
		Shipment sh2=new Shipment(sh1);*/
		Shipment sh3=new Shipment(10,20,30,40,50);
		System.out.println(sh3.volume());
		
		System.out.println(sh3.cost);
		System.out.println(sh3.weight);
		
	}

}
