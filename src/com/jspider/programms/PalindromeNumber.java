
//WAP to check if number is palindrome number or not.(If reverse of number = number).

package com.jspider.programms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n  =sc.nextInt();
		int rev =0,t=n;
		do{
			int r = n%10;
			rev = rev*10+r;
			n = n/10;
		}while(n!=0);
		if(rev==t){
			System.out.println(t + " is a palindrome");
		}
		else{
			System.out.println(t + " is not a palindrome");
		}

	}
}