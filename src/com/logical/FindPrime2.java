package com.logical;

import java.util.Scanner;

public class FindPrime2 {

	public static void main(String[] args) {
		int num;
		boolean isPrime;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		num=sc.nextInt();
		
		//num=13;
		if(num<2)isPrime=false;
		else isPrime=true;
		for(int i=2;i<num/i;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println("Prime number: "+num);
		else
			System.out.println("Not Prime number");

	}

}
