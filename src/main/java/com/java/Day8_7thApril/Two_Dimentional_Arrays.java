package com.java.Day8_7thApril;

public class Two_Dimentional_Arrays {

	public static void main(String[] args) {
		
		// Two-dimentional array [][]
		
		explanation();
		

	}
	
	public static void explanation() {
		
		//int[][] a = new int[4][3]; // Declared + Created
		
		/* Initialization
		a[0][0] = 11;
		a[0][1] = 22;
		a[0][2] = 33;
		a[0][3] = 44;
		
		a[1][0] = 55;
		a[1][1] = 66;
		a[1][2] = 77;
		a[1][3] = 88;
		
		a[2][0] = 99;
		a[2][1] = 111;
		a[2][2] = 222;
		a[2][3] = 333;
		*/
		// declaration, creation and initialization in one statement
		
		int[][] b = { {11, 22, 33, 44},
					  {55, 66, 77, 88},	
					  {99, 111, 222, 333} };
		
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		System.out.println(b[2].length);
		
		for(int i=0; i<b.length; i++) {
			
			for(int j=0; j<b[i].length; j++) {
				
				System.out.print(b[i][j] + " ");
				
			}
			System.out.println();
		}	
		
	}

}
