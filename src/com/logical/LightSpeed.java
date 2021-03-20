package com.logical;

public class LightSpeed {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		lightspeed=18600;
		days=Long.valueOf(args[0]);
		//days=ar
		seconds=days*24*60*60;
		distance =lightspeed*seconds;
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");

	}

}
