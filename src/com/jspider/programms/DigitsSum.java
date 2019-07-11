//WAP to calculate the sum of digits in the number

package com.jspider.programms;

import java.util.Scanner;

public class DigitsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum =0,t=n;
		do{
			int r = n%10;
			sum = sum+r;
			n = n/10;
		}while(n!=0);
		System.out.println("sum of " + t + " is " +sum);
	}
}