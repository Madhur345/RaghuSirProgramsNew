package com.jspider.programms;

import java.util.Scanner;

public class NaturalProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int i =1;
		int prod =1;
		while(i<=n){
			prod = prod * i;
			i++;
		}
		System.out.println("Sum of first " +n + " natural number is " + prod);
	}
}
