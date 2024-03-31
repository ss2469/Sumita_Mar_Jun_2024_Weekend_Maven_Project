package com.java.Day6_31stMarch;

public class Topic3_For_Loop {

	public static void printFirst100EvennumbersAddAddTheSum() {
		// print first 100 even numbers and add the sum
		
				int sum = 0;
				for(int i=1; i<=100; i++) {
					
					System.out.println(2*i);
					sum = sum + (2*i);
				}
				System.out.println(sum);
				
	}
	
	
		
	
	
	public static void main(String[] args) {
		
		printFirst100EvennumbersAddAddTheSum();
		
	}	


}
