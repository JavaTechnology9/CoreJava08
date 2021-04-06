package com.logical.Inheritance.Package2;

public class Protection extends com.logical.Inheritance.Package.Protection {
	public Protection() {
		System.out.println("derived other package constructor:");
		//System.out.println("default N value: " +n);
		//System.out.println("private  N_Pri value: " +n_pri);
		System.out.println("protected  N_pro value: " +n_pro);
		System.out.println("public  N_Pub value: " +n_pub);
	}
}
