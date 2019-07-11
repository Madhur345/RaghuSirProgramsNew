//n =3                     n =5
//***                      *****
//***                      *****
//***                      *****

package com.jspider.programms;

import java.util.Scanner;

public class PatternProgramm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
