//reverse the integer.

package com.kodnest.project;
import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args)
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Size of an array");
			int size=s.nextInt();
			int a[]=new int[size];
			System.out.println("Enter the Elemnts of an array");
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
			reverse(a);
		}
		
	}
static void reverse(int a[])
{
	System.out.println("The elements in reverse order");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}

}
