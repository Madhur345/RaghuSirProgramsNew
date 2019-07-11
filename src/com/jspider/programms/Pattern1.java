//WAP to display pattern as 
//1. 10
//--> 2 4 6 8

package com.jspider.programms;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		for(int i =1;i<=n;i=i+i){
			System.out.print(i + " ");
		}
	}
}