package com.logical;

public class ForLoop {

	public static void main(String[] args) {
		/*int a,b;
		for(a=1,b=4;a<b;a++,b--) {
			System.out.println("a value: "+a);
			System.out.println("b value:"+b);// 3<2
		}*/
		/*int i=0;
		boolean done=false;
		for(;!done;) {
			System.out.println("i is :"+i);
			if(i==10) done=true;
			i++;
		}*/
		/*for(;;) {
			System.out.println("*");
		}*/
		int nums[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		//for(int i=0;i<nums.length;i++)sum+=nums[i];
		//for(Type variable:collectionObjects)
		for(int x:nums) {
			System.out.println("x value: "+x);
			//sum+=x;
			//if(x==5)break;
			x=x*10;
			System.out.println("x value: "+x);
		}
		for(int x: nums)System.out.println(x);
		//System.out.println("sum: "+sum);
	}

	

}
