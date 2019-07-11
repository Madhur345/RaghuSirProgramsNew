//WAP to calculate the product of digits in a number.

package com.jspider.programms;

import java.util.Scanner;

public class DigitsProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int prod =1;
		do{
			int r = n%10;
			prod =prod *r;
			n = n/10;
		}
		while(n!=0);
		System.out.println("prod of digits ="+" "+prod);
	}
}
