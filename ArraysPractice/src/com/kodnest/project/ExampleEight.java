//reverse order of character

package com.kodnest.project;
import java.util.Scanner;
public class ExampleEight {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n =scan.nextInt();
		char a[]=new char[n];
		char temp[]=new char[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.next().charAt(0);
		}
	System.out.println("The elements in reverse order");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}

}

}
