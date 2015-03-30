package com.justus.Nakumatt;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Nakumatt {

	private static final String FLOUR = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] category1 = {"flour","cookingOil","sugar","vegetables"} ;
		String[] category2 ={" baking", "maize"};
		String[] commodity ={"elianto", "kimbo", "exe", "golden", "jogoo", "soko","mumias", "nzoia", "tomatoes", "kales", "cabbage"};
		
		Map<String, String> price = new HashMap<String, String>();
		
		price.put("Exe", "89/- per 2 kg");
		price.put("golden", "79/- per 2 kg");
		price.put("jogoo", "67/- per 2 kg");
		price.put("elianto", "120/- per ltr");
		price.put("kimbo", "130/- per kg");
		price.put("mumias", "200/- per 2 kg");
		price.put("mzoia", "190/- per 2 kg");
		price.put("tomatoes", "10/- per piece");
		price.put("kales", "10/- per bunch");
		price.put("cabbage", "30/- per head");
		price.put("soko", "65/- per 2 kg");
		
		System.out.println("Hi, welcome to Nakumatt.What is your order today?");
		
		String userOrder;
		userOrder = input.nextLine();
		
		
		if (userOrder.equals(category1[0])){
			System.out.println("we have maize and baking flour. Which one would you like to have?");
			
	}
		else if (userOrder.equals(category1[1])){
			System.out.println("we have Elianto and Kimbo. Which one would you like to have?");
	} 
		else if (userOrder.equals(category1[2])){
			System.out.println("we have mumias and nzoia. Which one would you like to have?");
	} 
		else if (userOrder.equals(category1[3])){
			System.out.println("we have tomatoes, kales, and cabbages. Which one would you like to have?");
	} 
		
		
		else if (userOrder.equals(commodity[3])){
			System.out.println(price.get(commodity[3]));
	} 
		
		
		else{System.out.println("Sorry we do not have that one. But we have flour, cooking oil, sugar and vegetables. You can try one.");}
	}
}

	
