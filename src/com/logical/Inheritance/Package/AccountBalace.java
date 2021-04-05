package com.logical.Inheritance.Package;

public class AccountBalace {

	public static void main(String[] args) {
		Balance current[]=new Balance[3];
		current[0]=new Balance("John", 145.23);
		current[1]=new Balance("Crystal", 178.45);
		current[2]=new Balance("Mike", 125.69);
		/*for(Balance bal:current)
			System.out.println(ba);*/
		for(int i=0;i<current.length;i++)
			current[i].show();
	}

}
