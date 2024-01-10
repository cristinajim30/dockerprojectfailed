package com.eclipse.calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to my simple calculator!");
		System.out.println("This program adds 5 numbers from 1 to 5 and display the result:");
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = calculatedSum(numbers);
		System.out.println("TOTAL SUM: " + sum);

	}

	private static int calculatedSum(int[] numbers) {
		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		return result;
	}

}
