package com.java.Day6_31stMarch;

public class Assignment2_For_Loop_Inside_While_Loop {

	public static void main(String[] args) {
		// TODO 'for' Loop inside 'while' Loop

		forLoopInsideWhileLoop();

	}

	public static void forLoopInsideWhileLoop() {

		int i = 1;

		while (i <= 5) {

			for (int j = 1; j <= 5; j++) {

				System.out.print("*" + " ");
			}
			System.out.println(i);
			i++;
		}

	}

}
