package com.jspider.programms;

import java.util.Scanner;

public class CointCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int fc = n/5;
		System.out.println("Numbers of 5 rupees coin " + fc);
		int tc =(n%5/2);
		System.out.println("Numbers of 2 rupees coin " + tc);
		int oc =(n%5%2/1);
		System.out.println("Numbers of 2 rupees coin " + oc);
		System.out.println("Total numbers of coin required = "+(fc+tc+oc));
	}
	

}
