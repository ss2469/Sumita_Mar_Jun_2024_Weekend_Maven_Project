package com.java.Day6_31stMarch;

public class Assignment1_Switch_Case2 {

	public static void main(String[] args) {
		
		determineVowelAmongAll26Albhabets();

	}

	public static void determineVowelAmongAll26Albhabets() {

		char alphabet = 'O';

		switch (alphabet) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			
			break;
		default:
			System.out.println("'" + alphabet + "'" + " is a Consonant.");

		}

	}

}
