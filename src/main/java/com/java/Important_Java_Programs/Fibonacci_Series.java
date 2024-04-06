package com.java.Important_Java_Programs;

public class Fibonacci_Series {

	static int number1 = 0, number2 = 1, number3 = 0;

	public static void main(String[] args) {

		fibonacciSeries();

		int count = 10;
		System.out.print(number1 + " " + number2);
		fibonacciSeriesUsingRecursion(count - 2);
		
	}
	
	
	

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34......
	// Print first 10 numbers of a Fibonacci Series
	// Without using recursion

	public static void fibonacciSeries() {

		int number1 = 0;
		int number2 = 1;
		int number3 = 0;
		int count = 10;

		System.out.print(number1 + " " + number2);

		for (int i = 2; i < count; i++) {

			number3 = number1 + number2;
			System.out.print(" " + number3);

			number1 = number2;
			number2 = number3;

		}
		System.out.println();
		System.out.println("***************************************");

	}

	// Print Fibonacci Series using Recursion
	// Recursion - It is the technique of making a function call itself.
	// This technique provides a way to break complicated problems down into simple
	// problems which are easier to solve.

	static void fibonacciSeriesUsingRecursion(int count) {

		if (count > 0) {

			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;

			System.out.print(" " + number3);

			fibonacciSeriesUsingRecursion(count - 1);

		}

	} 

} // Class ends
