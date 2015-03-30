package com.justus;

import java.util.Scanner;



public class greeting {
public static void main(String args[]){
	
	String name;
	 String activity;
	
	Scanner jay =new Scanner(System.in);
	System.out.println("Hi, tell me your name");
	name = jay.nextLine();
	
	if( name.equals("")){
		System.out.println("no name given");
	}
	else {
	System.out.println("welcome "  +name);
}
	System.out.println("what do you want to do today?");
	activity = jay.nextLine();
	System.out.println("Okay, I am searching for "  +activity);
}
}


