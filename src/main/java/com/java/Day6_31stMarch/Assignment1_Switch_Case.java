package com.java.Day6_31stMarch;

public class Assignment1_Switch_Case {

	public static void main(String[] args) {
		
		determineVowelAmongAll26Albhabets();

	}

	public static void determineVowelAmongAll26Albhabets() {

		char alphabet = 'q';

		switch (alphabet) {

		case 'a':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			
			break;

		case 'e':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;

		case 'i':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;

		case 'o':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;

		case 'u':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;
		case 'A':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			
			break;

		case 'E':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;

		case 'I':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;

		case 'O':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;

		case 'U':
			System.out.println("'" + alphabet + "'" + " is a Vowel.");
			break;	
			

		default:
			System.out.println("'" + alphabet + "'" + " is a Consonant.");

		}

	}

}
