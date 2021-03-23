package com.logical;

import java.io.IOException;
import java.util.Scanner;

public class SwitchWhile {
	public static void main(String[] args) throws IOException {
		int choice = 0;
		do {
			System.out.println("Help on:");
			System.out.println(" 1 if");
			System.out.println("2 switch");
			System.out.println("3 while");
			System.out.println("4 do-while");
			System.out.println("5 for");
			System.out.println("choose one");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			
		}while(choice<1||choice>5);
		System.out.println();
		switch(choice) {
		case 1:
			System.out.println("The if");
			System.out.println("if(condition) statement");
			System.out.println("else statement");
			break;
		case 2:
			System.out.println("The Switch");
			System.out.println("switch(expression)");
			System.out.println("case statements");
			System.out.println("break");
			break;
		case 3:
			System.out.println("The while");
			System.out.println("while(condition) statement");
			//System.out.println("else statement");
			break;
		case 4:
			System.out.println("The do-while");
			System.out.println("do statement");
			System.out.println("while condition");
			break;
		case 5:
			System.out.println("The for");
			System.out.println("for(ini;condition;iteration)");
			System.out.println("statements");
			break;
		}
	}

}
