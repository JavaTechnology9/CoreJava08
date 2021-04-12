package com.logical.Inheritance.OOPS;

public class StaticMethodOverride extends StaticNonStatic{
	public  void foo() {
		
		System.out.println("foo method StaticMethodOverride");
	}
	public static void main(String[] args) {
		StaticMethodOverride st=new StaticMethodOverride();
		st.foo();
		//StaticMethodOverride.foo();
		//StaticNonStatic.foo();
	}

}
