package com.kodnest.project;

public class ExampleFive {
	public static void main(String[] args) {
		
	int a[]= {5,2,7,3,9};
	int smallest=a[0];
	//System.out.println("Enter the Elemnts of an array");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
	}
	System.out.println(smallest);

}
}
