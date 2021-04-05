package com.logical.Inheritance;

public  class BoxWeight extends Box {
	double weight;
	public BoxWeight() {
		super();
		weight=-1;
	}
	public BoxWeight(double w, double h, double d, double we) {
		/*width=w;
		height=h;
		depth=d;
		weight=we;*/
		
		super(w,h,d);
		System.out.println("BoxWeight constructor:");
		weight=we;
		
	}
	public BoxWeight(BoxWeight obj) {
		super(obj);
		weight=obj.weight;
	}
	
	public BoxWeight(double len, double m) {
		super(len);
		weight=m;
	}
	double volume() {
		double volume = super.volume();
		return volume *weight;
	}

}
