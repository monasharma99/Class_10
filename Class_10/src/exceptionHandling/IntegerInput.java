package exceptionHandling;

import java.util.Scanner;

import java.util.InputMismatchException;
public class IntegerInput {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int CorrectInteger = 56;
		int tries = 1;
		
		try {
			System.out.println("Please enter a number :");
			int integer = k.nextInt();
		
			System.out.println("The number entered by you is - " + integer);
			integer = k.nextInt();
			while (integer != CorrectInteger){
			 System.out.println("Please  try again");
			 
			 tries++;
			
			 integer = k.nextInt();}
		
		if (integer == CorrectInteger ) {
			System.out.println("Your number is Correct");
		}
		else {
			System.out.println("Please enter a number :");
		}	
		}
		catch (Exception e) {System.out.println("Try again, the number you entered is not an integer. Please try again." );

		}
		
	}
	}

