package com.java.Day5_30thMarch;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO find out leap year from given years
		
		// Divided by 400
		// Divided by but not divided by 100
		
		int year1 = 1900;
		int year2 = 1996;
		int year3 = 2002;
		int year4 = 2000;
		
		/*if ((year1 % 400 == 0) || (year1 % 4 == 0 && year1 % 100 != 0)) {
			
		}*/
		
		
		if ((year1 % 400 == 0) || (year1 % 4 == 0 && year1 % 100 != 0)) {
			System.out.println("Year1 is a leap year : " + year1);
			} else {
			System.out.println("It is not a leap year");
			}

			if ((year2 % 400 == 0) || (year2 % 4 == 0 && year2 % 100 != 0)) {
			System.out.println("Year2 is a leap year : " + year2);
			} else {
			System.out.println("It is not a leap year");
			}

			if ((year3 % 400 == 0) || (year3 % 4 == 0 && year3 % 100 != 0)) {
			System.out.println("Year3 is a leap year : " + year3);
			} else {
			System.out.println("It is not a leap year");
			}
			if ((year4 % 400 == 0) || (year4 % 4 == 0 && year4 % 100 != 0)) {
			System.out.println("Year4 is a leap year : " + year4);
			} else {
			System.out.println("It is not a leap year");
			}
			}
		

	}


