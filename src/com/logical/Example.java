package com.logical;

public class Example {

	public static void main(String[] args) {
		int value=2;
		int arr[][]=new int [4][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<5;j++) {
			value=value*2;
			arr[i][j]=value;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
				//System.out.println();
			}
			System.out.println();
		}
			
	}

}
