package com.logical.Inheritance;

public class Shipment extends BoxWeight {
	double cost;

	public Shipment(Shipment obj) {
		super(obj);
		cost = obj.cost;
	}

	public Shipment(double w, double h, double d, double we, double co) {
		//super(w, h, d, we);
		super();
		System.out.println("Shipment constructor:");
		cost = co;
		//super(len);
	}

	public Shipment() {
		super();
		cost = -1;
	}

	public Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
	double volume() {
		double volume = super.volume();
		return volume *cost;
	}

}
