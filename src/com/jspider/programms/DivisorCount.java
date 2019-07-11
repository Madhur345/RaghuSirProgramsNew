package com.jspider.programms;

import java.util.Scanner;

public class DivisorCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i =2;
		int count =2;
		int num = sc.nextInt();
		while(i<=num/2){
			if(num%i==0){
				count ++;
			}
			i++;
		}
		System.out.println("Number of divisor of " + num +": " +count);
	}
}
