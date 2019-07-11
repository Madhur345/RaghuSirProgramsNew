package com.jspider.programms;

import java.util.Scanner;

public class LeapYearPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int n = sc.nextInt();
		int i =1;
		while(i<=n){
			if(i%400==0 || i%4==0 && i%100!=0){
				System.out.println(i);
			}
			i++;
		}
	}
}