package com.logical;

public class BooleanLogic {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c= a|b;
		boolean d= a&b;
		System.out.println(" c value:"+c); // true
		System.out.println(" d value:"+d);// false 
		boolean e=(!a&b)|(a&!b);  //(false&false)  false| (true&true)   false| true
		boolean f=!a;
		System.out.println(" e value:"+e); // true
		System.out.println(" f value:"+f);// false
		
		

	}

}
