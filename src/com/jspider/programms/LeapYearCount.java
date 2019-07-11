package com.jspider.programms;

import java.util.Scanner;

public class LeapYearCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int n = sc.nextInt();
		int count =n/400 + n/4 -n/100;
		System.out.println("count of leap year upto " + n + " is " + count);
	}
}
