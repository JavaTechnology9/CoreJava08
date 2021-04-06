package com.logical.Inheritance.Package;

public class CallBackImpl implements Callback{

	@Override
	public void callback(int param) {
		//val=25;
		System.out.println("callback called with :"+param);
		
	}
	void nonInterfaceMethod() {
		System.out.println("CallbackImpl method");
	}
	public static void main(String[] args) {
		Callback impl= new CallBackImpl();
		impl.callback(42);
		((CallBackImpl) impl).nonInterfaceMethod();
	}

}
