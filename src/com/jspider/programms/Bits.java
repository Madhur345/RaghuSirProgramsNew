// WAP to define a methods to return how many bits are settled in the passed integer.

package com.jspider.programms;

import java.util.Scanner;

public class Bits{
	static int countSettledBits(int n){
		int count =0;
		do{
			if(n%2==1)
				count ++;
			n =n/2;
	}while(n!=0);
		return  count;
}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int c = sc.nextInt();
	  System.out.println(countSettledBits(c ));
	}
}
