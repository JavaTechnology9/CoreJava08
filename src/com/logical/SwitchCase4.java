package com.logical;

public class SwitchCase4 {

	public static void main(String[] args) {
		int month=25;
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2:
			season="Winter";//
			break;
		case 3:
		case 4:
		case 5:
			season="Spring";
			break;
		case 6:
		case 7:
		case 8:
			season="Summer";
		case 9:
		case 10:
		case 11:
			season="Autumn";
			break;
		default:
			season="test";
			
		}
		System.out.println("April is in the "+season+".");

	}

}
