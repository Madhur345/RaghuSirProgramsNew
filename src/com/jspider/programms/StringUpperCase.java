//WAP to define a method to convert every character in a string to uppercase;

package com.jspider.programms;

import java.util.Scanner;

public class StringUpperCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =s.nextLine();
		String up = toUpperCase(str);
		System.out.println(up);
	}
	static String toUpperCase(String str)
	{
		char ch[]= str.toCharArray();//{'J','a','v','a'}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);//a =97,A=65
		}
		str = new String(ch);
		return str;
	}
}