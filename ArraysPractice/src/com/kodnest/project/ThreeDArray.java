package com.kodnest.project;
import java.util.Scanner;
public class ThreeDArray {
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Size of an array");
			int m=scan.nextInt();
			System.out.println("Enter the Size of an array");
			int n=scan.nextInt();
			System.out.println("Enter the Size of an array");
			int o=scan.nextInt();
			int a[][][]=new int[m][n][o];
			System.out.println("Enter the Elemnts of an array");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++) {
					for(int k=0;k<a[i][j].length;k++)
					{

						a[i][j][k]=(int) scan.nextDouble();
					}
				}
			}
			System.out.println("Height of the elemnts:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++) {
					for(int k=0;k<a[i][j].length;k++)
					{

						System.out.println(a[i][j][k]);
					}
					System.out.println();
				}
				System.out.println();
			}
		}
}