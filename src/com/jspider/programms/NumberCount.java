package com.jspider.programms;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i = 40;
		int count =1;
		while (i<=n){
			if(i % 5 ==0 && i % 7 ==0){
				count ++;
			}
			i++;	
		}
		System.out.println("The count upto " +n + " which is exactly divisble by 5 and 7 is " + count);
	}
}