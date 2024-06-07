package com.kodnest.project;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] createArray=createArray(n);
		scan.close();
		System.out.println("The Array elements are:");
		for(int i=0;i<createArray.length;i++)
		{
			System.out.println(createArray[i]);
			
		}
		//display elements in reverse order
		
		
		
	}
	static int[] createArray(int n)
	{
		//create an array
		Scanner scan=new Scanner(System.in);
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		scan.close();
		//System.out.println("Enetr the Elements of an Array: ");
	//	for(int i=0;i<a.length;i++)
	//	{
	//		System.out.print(a[i]+" ");
	//	}
		return a;
	}

}
