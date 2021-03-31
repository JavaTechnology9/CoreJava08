package com.logical.classExamples;

public class UseStaticMain {
	public static void main(String[] args) {
		UseStatic use1=new UseStatic();
		UseStatic use2=new UseStatic();
		UseStatic use3=new UseStatic();
		UseStatic use4=new UseStatic();
		UseStatic use5=new UseStatic();
		use1.a=25;
		use1.b=35;
		use1.c=12;
		use2.c=15;
		use3.c=45;
		use4.c=78;
		use5.c=65;
		UseStatic.meth(10);
		System.out.println(use1.a);
		System.out.println(use1.b);
		System.out.println(use1.c);
		System.out.println("============");
		System.out.println(use2.a);
		System.out.println(use2.b);
		System.out.println(use2.c);
		System.out.println("============");
		System.out.println(use3.a);
		System.out.println(use3.b);
		System.out.println(use3.c);
		System.out.println("============");
		System.out.println(use4.a);
		System.out.println(use4.b);
		System.out.println(use4.c);
		System.out.println("============");
		System.out.println(use5.a);
		System.out.println(use5.b);
		System.out.println(use5.c);
		System.out.println("============");
		
	}
}
