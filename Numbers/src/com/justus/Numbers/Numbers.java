package com.justus.Numbers;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
			System.out.println("***What is your number?***\nEnter it below:\n");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			
			if (num %2 == 0){
				System.out.println("Number is Even");
			}
			else {
				System.out.println("Number is Odd");
			}
	}

}
