//largest one

package com.kodnest.project;
import java.util.Scanner;
public class ExampleFour {
	public static void main(String[] args) {
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
	largeElement(a);

}
	static void largeElement(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}
}

