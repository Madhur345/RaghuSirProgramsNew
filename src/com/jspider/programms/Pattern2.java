package com.jspider.programms;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter then number of lines");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for (int j=1;j<=n/2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}