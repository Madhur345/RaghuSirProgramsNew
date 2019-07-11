//WAP to calculate the sum of digits in a string;

package com.jspider.programms;

import java.util.Scanner;

public class StringDigitSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =s.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0' && ch <='9')
				sum =sum +(ch-48);
		}
		System.out.println("sum of disgits : " + sum);
	}
}
