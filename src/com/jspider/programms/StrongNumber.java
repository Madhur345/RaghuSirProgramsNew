//WAP to check if number is strong number or not.(sum  of factorial of its digits=number)

package com.jspider.programms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum =0,t=n;
		do{
			int f =1;
			int r =n%10;
			while(r>1){
				f =f*r;
				r--;
			}
			sum = sum+f;
			n = n/10;
		}while(n!=0);
		if (sum==t){
			System.out.println(t + " is a strong number");
		}
		else{
			System.out.println(t + " is a not strong number");
		}
	}
}