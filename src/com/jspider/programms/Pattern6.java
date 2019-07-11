//A A A A A 
//B B B B B 
//C C C C C 
//D D D D D 
//E E E E E 


package com.jspider.programms;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n =sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print((char)(i+65) + " ");
			}
			System.out.println();
		}
	}
}
