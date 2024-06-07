//replace the integer with negative sign.

package com.kodnest.project;
import java.util.Scanner;

public class ExampleThird {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elemnts of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		s.close();
		replace(a);
		
	}
	static void replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=-a[i];
		}
		System.out.println("The Replaced negative elements of an Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		
	}

}
}
