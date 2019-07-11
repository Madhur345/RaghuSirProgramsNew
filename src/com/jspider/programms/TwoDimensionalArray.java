package com.jspider.programms;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row and columns");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int ar[][]=new int[r][c];
		System.out.println("Enter "+r*c+ "elements :");

		for(int i=0;i<ar.length;i++)//no of rows
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the matrix elements");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
