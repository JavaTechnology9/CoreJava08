package com.logical;

public class GotoExample {

	public static void main(String[] args) {
		outer:for(int i=0;i<3;i++) {
			System.out.print("Pass:"+i+":");
			for(int j=0;i<100;j++) {
				if(j==10)break outer;
				System.out.print(j+" ");
			}
			System.out.println("This line will print?");
		}
	System.out.println("Loops are completed");

	}

}
