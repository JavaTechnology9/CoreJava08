package com.logical.Inheritance.Package;

public class Derived extends Protection{
	public Derived() {
		System.out.println("derived constructor:");
		System.out.println("default N value: " +n);
		//System.out.println("private  N_Pri value: " +n_pri);
		System.out.println("protected  N_pro value: " +n_pro);
		System.out.println("public  N_Pub value: " +n_pub);
	}

}
