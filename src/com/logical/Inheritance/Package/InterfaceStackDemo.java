package com.logical.Inheritance.Package;

public class InterfaceStackDemo {

	public static void main(String[] args) {
		IntStack stack=new FixedStack(10);
		for(int i=0;i<40;i++)
			stack.push(2+i);
		for(int i=0;i<40;i++)
			System.out.print(stack.pop()+" ");

	}

}
