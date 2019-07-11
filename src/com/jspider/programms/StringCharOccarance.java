//Write a java program to print no of occorance of each character present in a string
package com.jspider.programms;

import java.util.Scanner;

public class StringCharOccarance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =sc.nextLine();
		int count[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i +"-------------"+count[i]);
		}
	}
}