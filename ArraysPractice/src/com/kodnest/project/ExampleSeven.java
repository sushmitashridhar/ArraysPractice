//sub array summ

package com.kodnest.project;

import java.util.Scanner;

public class ExampleSeven {
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
		displaySubArray(a);

	}
	static void displaySubArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print("the subArray format is:"+a[k]+ "");
				}
				System.out.println();
			}

		}
	}
}
//sum=sum+a[k]
//		if(sum==sumarraysum)
//		{
//			count++;
//		}

