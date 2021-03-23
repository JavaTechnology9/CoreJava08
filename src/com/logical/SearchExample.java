package com.logical;

public class SearchExample {

	public static void main(String[] args) {
		int nums[]= {6,2,3,8,7,1,5,9};
		int val=15;
		boolean found=false;
		for(int x:nums) {
			if(x==val) {
				found=true;
				break;
			}
		}
		if(found)System.out.println("value found");
	}

}
