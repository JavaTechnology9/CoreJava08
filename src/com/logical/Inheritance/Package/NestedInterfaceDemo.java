package com.logical.Inheritance.Package;

//import com.logical.Inheritance.Package.NestedClass.NestedInterface;

public class NestedInterfaceDemo {

	public static void main(String[] args) {
		NestedClass.NestedInterface face=new NestedSubclass();
		System.out.println(face.isNotNegative(45));
	}

}
