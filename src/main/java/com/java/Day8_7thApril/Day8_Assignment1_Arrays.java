package com.java.Day8_7thApril;

public class Day8_Assignment1_Arrays {

	public static void main(String[] args) {
		
		// Q1. 
  		//Create a 1-D int array which should have 10 elements
		//Determine the length of this array
		//Print all the elements of this array
		//Retrieve the 7th and 10th element of this array
		
		
		// Q2.
		//Create a 2-D String array which should have 2X3
		//Determine the length of this array
		//Print all the elements of this array
		//Retrieve the element in the 2nd row 3rd col   and  the element in 3rd row 4th col
		
		
		one_dimentional_array();
		System.out.println("************************");
		two_dimentional_array();
	
	}
	
	
	public static void one_dimentional_array() {
		
		//int[] a = new int[10];
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 111 };
		
		System.out.println("Length of the array a : " + a.length);
		
		for(int i=0; i <= a.length-1; i++) {
			
			System.out.print(a[i] + ", ");
		}
		
		System.out.println();
		System.out.println(a[6]);
		System.out.println(a[9]);
		
	}
	
	
	
	public static void two_dimentional_array() {
		
		int[][] b = { {11, 22, 33},
				      {44, 55, 66} };
		
		System.out.println(b.length); // no. of rows in 2D array
		
		for(int i=0; i<b.length; i++) {
			
			for(int j=0; j<b[i].length; j++) {
				
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(b[1][2]);
		System.out.println(b[2][3]);	// ArrayIndexOutOfBoundsException
		
	}
	


}