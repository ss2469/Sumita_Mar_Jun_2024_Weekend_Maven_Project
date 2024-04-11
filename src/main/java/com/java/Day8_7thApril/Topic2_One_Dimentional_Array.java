package com.java.Day8_7thApril;

public class Topic2_One_Dimentional_Array {
	
	
	
	
	

	public static void main(String[] args) {
		
		// Declaration of arrays
		// 3 ways
		int a[];
		int[] b;
		int[]c;
		
		int[] d = new int[6]; // ArrayIndexOutOfBoundsException
		d[0] = 2;
		d[1] = 50;
		d[2] = 60;
		d[3] = 7;
		d[4] = 14;
		d[5] = 8;
		
		for(int i=0; i <= d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("***************************************");
		
		String[] s1 = {"My ", "name ", "is ", "John ", "Doe", "."};
		
		for(int j=0; j <= s1.length-1; j++) {
			System.out.print(s1[j]);
		}
		
		

	}

}
