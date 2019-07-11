package com.jspider.programms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i =1;
		int count =1;
		while(i<=n/2){
			if(n%i==0)
				count++;
			if(count >2)
				break;
			i++;
		}
		if(count==2){
			System.out.println(n + " is a prime number");
		}
		else{
			System.out.println(n + " is not a prime number");
		}
	}

}
