package com.jspider.programms;

import java.util.Scanner;

public class StringPalindromeEfficient {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str =s.nextLine();
		boolean rs = isPalindrome(str);
		if(rs)
			System.out.println(str + " is palindrome");
		else
			System.out.println(str + " is not palindrome");
	}
	static boolean isPalindrome(String str)
	{
		int i=0;
		while(i<str.length()/2)
		{
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c1!=c2)
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
