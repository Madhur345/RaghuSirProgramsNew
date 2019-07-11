//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 

package com.jspider.programms;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n =sc.nextInt();
		for(int i =1;i<=n;i++){
			for(int j =0;j<n;j++){
				System.out.print((char)(j+65) + " ");
			}
			System.out.println();
		}
	}
}
