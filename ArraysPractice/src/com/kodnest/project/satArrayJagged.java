package com.kodnest.project;
import java.util.Scanner;

public class satArrayJagged {
//	public static void main(String arg[])
//	{
//		//Scanner scan=new Scanner(System.in);
//		int a[][][]=new int[2][][];
//		a[0]=new int[2][];
//		a[0][0]=new int[3];
//		a[0][1]=new int[2];
//		a[1]=new int[1][];
//		a[1][0]=new int[2];
//		
//	}
	//import java.util.Scanner;

	    public static void main(String[] args) {

	         Scanner scan = new Scanner(System.in);

	        int[][] arr = new int[scan.nextInt()][];

	 

	        for (int i=0; i<=arr.length-1; i++) 

	        {   

	            arr[i] = new int[scan.nextInt()];

	        }

	 

	 

	        for (int i=0; i<=arr.length-1; i++) 

	        {

	            for (int j=0; j<=arr[i].length-1; j++) 

	            {

	                arr[i][j] = scan.nextInt();

	            }

	        }

	        System.out.println("Student Marks:");

	        for (int i = 0; i<=arr.length-1; i++) 

	        {

	            System.out.println("College " + (i + 1) + ":");

	            for (int j = 0; j<=arr[i].length-1; j++) 

	            {

	                System.out.println("Student " + (j + 1) + ": " + arr[i][j]);

	            }

	        }

	        scan.close();

	    }

	}
