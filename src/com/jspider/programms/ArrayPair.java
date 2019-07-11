//WAP to print the pair of elements whose sum is equal to n.

package com.jspider.programms;

import java.util.Scanner;

public class ArrayPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		int x[]={2,7,6,5,4,8,9,3};
		arrayPair(x,n);
	}
	static void arrayPair(int a[],int n)
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println(a[i] + "," +a[j]);
				}
			}
		}
	}
}
