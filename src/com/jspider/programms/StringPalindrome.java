//WAP to define a method to check string is palindrome or not;


package com.jspider.programms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =s.nextLine();
		boolean rs =isPalindrome(str);
		if(rs){
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
	}

	static boolean isPalindrome(String str)
	{
		String rev ="";
		for(int i=str.length()-1;i>=0;i--)	
		{
			char ch =str.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		boolean fs =rev.equals(str);
		return fs;
	}
}


