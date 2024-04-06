package com.java.Important_Java_Programs;

public class Prime_Numbers_Program {

	public static void main(String[] args) {
		// TODO print Prime Numbers
		// Prime Numbers - a whole number greater than 1 that cannot be exactly divided
		// by any whole number other than itself and 1
		// e.g. 2, 3, 5, 7, 11, 13, 17, 19, 23, 29......

		//checkPrimeNumber(29);
		printPrimeNUmbers();

	}
	
	public static void checkPrimeNumber(int n) {

		int m = 0, flag = 0;
		m = n/2;
		if((n == 0) || (n == 1)) {
			System.out.println(n + " is NOT a prime number.");
		}else {
			
			for(int i=2; i<=m; i++) {
				
				if((n % i) == 0) {
					System.out.println(n + " is NOT a prime number.");
					flag =1;
				}		
			}
			
			if(flag == 0)
				System.out.println(n + " is a prime number.");
		}
	}
	
	// print Prime Numbers between 1 to 30 :
	// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
	
	public static void printPrimeNUmbers() {
		
		
		for (int i = 2; i <= 30; i++) {

			int flag = 0;
			int k = i/2;
			
			for (int j = 2; j <= k; j++) {
				if ((i % j) == 0) {
					flag = 1;
				}
			}

			if (flag == 0)
				System.out.print(" " + i);
			
		}
		
	}
	
		
}


