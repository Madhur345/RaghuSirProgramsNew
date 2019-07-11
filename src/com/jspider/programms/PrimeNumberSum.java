package com.jspider.programms;

import java.util.Scanner;

public class PrimeNumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Prime p = new Prime();
		int sum = 0;
		for(int i=1;i<=n/2;i++){
			boolean fs = p.isPrime(i);
			if(fs){
				sum = sum +i;
			}
		}
		System.out.println("Sum of prime number of First "+ n + " Prime number " + " : "+sum) ;
	}
}
