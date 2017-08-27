package com;

public class HighestNumber {
	// Logic to check the Highest of three numbers
	public void getHighestNumber(int firstNumber, int secondNumber, int thirdNumber) {
		if (firstNumber > secondNumber) { 												// Checks first no. is greater than second no.
			if (firstNumber > thirdNumber) {											// Checks first no. is greater than third no.
				System.out.println("Highest of the among three is a " + firstNumber);
			} else {
				System.out.println("Highest of the among three is c " + thirdNumber);
			}
		} else {
			if (secondNumber > thirdNumber) {											// Checks second no. is greater than third no.		
				System.out.println("Highest of the among three is b " + secondNumber);
			} else {
				System.out.println("Highest of the among three is c " + thirdNumber);
			}
		}
	}
 
	// Main function
	public static void main(String[] args) {
		int firstNumber = 4, secondNumber = 8, thirdNumber = -2;

		System.out.println("The values of the three numbers are \nFirst Number	: " + firstNumber
				+ "\nSecond Number	: " + secondNumber + "\nThird Number	: " + thirdNumber + "\n");

		HighestNumber hn = new HighestNumber();

		hn.getHighestNumber(firstNumber, secondNumber, thirdNumber);	// Calling highest number function.
	}
}