package com.java.Day6_31stMarch;

public class Topic4_Nested_For_Loop {

	/* for loop inside for loop
	 * outer for loop
	 * inner for loop
	 * Logic - for every 1 iteration of outer for loop,
	 *  inner for loop executes for all iterations 
	 */
	
	public static void squarePattern() {
		
		for(int i=1; i<=5; i++) {
			
			
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			} // inner loop ends
			
			System.out.println();
			
		} // outer for loop ends
			
	}
	
	// output:
	// * * * * *
	// * * * * *
	// * * * * *
	// * * * * *
	// * * * * *
	
	
	public static void trianglePattern() {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");				
			}
			System.out.println();
		}
		
	}
	
	// output:
	// * 
	// * * 
	// * * * 
	// * * * * 
	// * * * * *
	
	
	public static void invertedTrianglePattern() {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// output:
	// * * * * *
	// * * * * 
	// * * * 
	// * * 
	// * 
		
	
	
	public static void main(String[] args) {
		
		//squarePattern();
		
		trianglePattern();
		
		invertedTrianglePattern();
		
	}

}

