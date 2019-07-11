package com.jspider.programms;

import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd Number");
		int c= sc.nextInt();

		if(a>b && a>c){
			System.out.println(a +" a is biggest");
		}
		else if(b>c){
			System.out.println(b + " b is biggest");
		}
		else{
			System.out.println(c + " c is biggest");
		}
	}
}
