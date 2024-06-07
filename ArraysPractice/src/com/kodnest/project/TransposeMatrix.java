package com.kodnest.project;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("User please enter the rows");
		int row=scan.nextInt();
		System.out.println("User please enter the columns");
		int col=scan.nextInt();
		int a[][]=new int[row][col];
		System.out.println("User!! please enter the original matrix elememts:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		int t[][];
		if(row==col)
		{
			t=new int[row][col];
		}
		else {
			t=new int[col][row];
		}
		//transpose matrix

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				t[i][j]=a[j][i];
			}
		}
		//displaying transpose 
		System.out.println("Transpose matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		
	}

}

}