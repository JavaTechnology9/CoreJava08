package com.logical;

public class ScopeAndLife {
	public static void main(String[] args) {
		int x;
		int y=-1;// Decalre 
		for(x=0;x<3;x++) {
			
			System.out.println("Y value: "+y);
			y=100;
			System.out.println("After changing the value: "+y);
		}
		System.out.println(y);
	}

}
