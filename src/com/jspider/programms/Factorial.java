package com.jspider.programms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i + "!" + " = " + fact(i));
		}
	}



	static int fact(int n){
		int i =1;
		int prod =1;
		while(i<=n){
			prod = prod *i;
			i++;
		}
		return prod;
	}
}
