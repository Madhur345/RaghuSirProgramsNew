package com.jspider.programms;

import java.util.Scanner;

public class TwoDimensionalArrayBiggest {
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
		Matrix mt = new Matrix();
		int ele=mt.getBiggest(ar);
		System.out.println("Biggest Element is : " + ele);
	}
}



class Matrix{
	int getBiggest(int m[][])
	{
		int big =m[0][0];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				if(m[i][j]>big)
					big =m[i][j];
			}
		}
		return big;
	}
}