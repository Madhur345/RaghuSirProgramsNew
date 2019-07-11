//WAP to display the multiplication table for user enterd number.

package com.jspider.programms;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int j =1;
		while(j<=n){
		for(int i=1;i<=10;i++){
			System.out.print(j +"*" + i+" = "+j*i + " ");
		}
		j++;
		System.out.println();
		}	
	}
}