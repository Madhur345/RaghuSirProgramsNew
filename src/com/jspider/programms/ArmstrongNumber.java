//WAP to check if number is Armstrong number or not.
//A number is Armstrong if sum of cubes of a digit is equal to number itself.

package com.jspider.programms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum =0,t=n;
		do{
			int r =n%10;
			sum = sum + r*r*r;
			n = n/10;
		}while(n!=0);
		if(sum==t){
			System.out.println(t + " is Armstrong number");
		}
		else {
			System.out.println(t + " is not Armstrong number");
		}
	}
}
