package com.kodnest.project;
import java.util.Scanner;
public class ExampleOfVowels {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine().toLowerCase(); // Convert the input to lowercase for case-insensitivity

			int vowelsCount = 0;
			int consonantsCount = 0;

			for (char ch : input.toCharArray()) {
				if (Character.isLetter(ch)) {
					if (isVowel(ch)) {
						vowelsCount++;
					} else {
						consonantsCount++;
					}
				}
			}

			System.out.println("Vowels: " + vowelsCount);
			System.out.println("Consonants: " + consonantsCount);
		}
	}

	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
