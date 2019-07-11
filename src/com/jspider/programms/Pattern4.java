//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 

package com.jspider.programms;

import java.util.Scanner;

public class Pattern4 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of lines");
			int n =sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j =1;j<=n;j++){
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
}
