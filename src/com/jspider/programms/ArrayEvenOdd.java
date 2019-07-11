//WAP to define a method to return how many even numbers and odd numbers present in an array

package com.jspider.programms;

import java.util.Scanner;

public class ArrayEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the value of " + n);
		for(int i=0;i<n;i++){
			ar[i] =sc.nextInt();
		}
		int count[]=countEO(ar);
		System.out.println("Count of Even number " + count[0]);
		System.out.println("Count of Odd number " + count[1]);
	}

	static int[] countEO(int[]x){
		int c[]={0,0};
		for(int i=0;i<x.length;i++){
			if(x[i]%2==0)
				c[0]++;
			else
				c[1]++;
		}
		return c;
	}
}
