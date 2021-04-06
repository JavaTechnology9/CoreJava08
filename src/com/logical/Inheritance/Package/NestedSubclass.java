package com.logical.Inheritance.Package;

import com.logical.Inheritance.Package.NestedClass.NestedInterface;

public class NestedSubclass implements NestedInterface{

	@Override
	public boolean isNotNegative(int value) {
		
		return value<0?false:true;
	}
	

}
