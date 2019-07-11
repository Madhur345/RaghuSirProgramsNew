package com.jspider.programms;

import java.util.Scanner;

public class PerfectNumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum =0;
		Perfect f = new Perfect();
		for(int i =1;i<=n/2;i++){
			boolean fs = f.isPerfect(i);
			if(fs){
				sum = sum +i;
			}
		}
		System.out.println("sum of fisrt " + " perfect number is " + sum);
	}
}
