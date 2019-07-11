//WAP to calculate the average of array elements; 

package com.jspider.programms;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int[]ar = new int[n];
		System.out.println("Enter the values of "+ n);
		int sum=0;
		for(int i=0;i<n;i++){
			ar[i] = sc.nextInt();
			sum =sum +ar[i];
		}
		System.out.println("Average of Array : " + sum/n );
	}
}