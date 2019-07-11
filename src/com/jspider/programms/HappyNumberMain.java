package com.jspider.programms;

import java.util.Scanner;

public class HappyNumberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		HappyNumber hn = new HappyNumber();
		boolean fs=hn.isHappy(n);
		if(fs){
			System.out.println(n + " is a happy number");
		}
			else{
				System.out.println(n + " is not a happy number");
			}
		}
	}
