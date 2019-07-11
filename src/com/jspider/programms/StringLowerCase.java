
//WAP to define a method to convert every character in a string to uppercase;

package com.jspider.programms;

import java.util.Scanner;

public class StringLowerCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =s.nextLine();
		String lc =toLowerCase(str);
		System.out.println(lc);
	}
	static String toLowerCase(String str)
	{
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		str = new String(ch);
		return str;
	}
}