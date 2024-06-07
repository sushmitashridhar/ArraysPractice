package com.kodnest.project;
import java.util.Scanner;
public class Example {
//	public static void main(String[] args)
//	{
//		Scanner scan =new Scanner(System.in);
//		System.out.println("enter the elements:");
//		int m=scan.nextInt();
//		System.out.println("enter the elements:");
//		int n=scan.nextInt();
//		System.out.println("enter the elements:");
//		int o=scan.nextInt();
//		int a[][][]=new int		
//	}
//	import java.util.Scanner;

	//public class StudentMarksArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of colleges:");
	        int numColleges = scanner.nextInt();

	        for (int collegeIndex = 1; collegeIndex <= numColleges; collegeIndex++) {
	            System.out.println("Enter the number of students in College " + collegeIndex + ":");
	            int numStudents = scanner.nextInt();

	            System.out.println("Enter the marks of students in College " + collegeIndex + ":");
	            for (int studentIndex = 1; studentIndex <= numStudents; studentIndex++) {
	                System.out.println("Enter marks for Student " + studentIndex + ":");
	                int marks = scanner.nextInt();
	                System.out.println("College " + collegeIndex + ", Student " + studentIndex + ": " + marks);
	            }
	        }

	        scanner.close();
	    }
}




////
//import java.util.Scanner;
//import java.util.Arrays;
//
////public class ReverseWordsInSentence {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input sentence
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//
//        // Reverse words in the sentence
//        String[] reversedWords = reverseWords(sentence);
//
//        // Output reversed words
//        System.out.println("Reversed words: " + Arrays.toString(reversedWords));
//
//        scanner.close();
//    }
//
//    static String[] reverseWords(String sentence) {
//        // Split the sentence into words
//        String[] words = sentence.split("\\s+");
//
//        // Reverse the order of words
//        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
//            String temp = words[i];
//            words[i] = words[j];
//            words[j] = temp;
//        }
//
//        return words;
//    }
//}
