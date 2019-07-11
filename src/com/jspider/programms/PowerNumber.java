package com.jspider.programms;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the power");
		int p =sc.nextInt();
		int pw =1;
		int t=p;
		while(p>0){
			pw = pw*n;
			p--;
		}
		System.out.println(t+ " to the power " + n +" is " + pw);
	}
}
