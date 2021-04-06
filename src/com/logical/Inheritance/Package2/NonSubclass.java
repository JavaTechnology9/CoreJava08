package com.logical.Inheritance.Package2;

import com.logical.Inheritance.Package.Protection;

public class NonSubclass {
	public NonSubclass() {
		Protection pr=new Protection();
		System.out.println("same package constructor");
		//System.out.println(pr.n);
		//System.out.println(pr.n_pri);
		//System.out.println(pr.n_pro);
		System.out.println(pr.n_pub);
		//pr.show();
		
	}

}
