package com.logical.Inheritance;

public class ColorBox extends Box{
	int color;
	public ColorBox(double w, double h, double d, int c) {
		/*width=w;
		height=h;
		depth=d;*/
		super(w,h,d);
		color=c;
	}
	public ColorBox(ColorBox box) {
		super(box);
		this.color=box.color;
	}
	public ColorBox(double len, int co) {
		super(len);
		this.color=co;
	}
	public ColorBox() {
		super();
		this.color=-1;
	}

}
