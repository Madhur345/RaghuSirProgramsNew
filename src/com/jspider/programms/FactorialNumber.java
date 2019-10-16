package com.jspider.programms;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the number");
		int n = sc.nextInt();
		int prod =1;
		int i=1;
		while(i<=n){
			prod =prod*i;
			i++;
		}
		System.out.println("Factorial of " + n +" = " + prod);
	}
}
