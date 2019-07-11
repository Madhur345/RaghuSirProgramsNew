//WAP to check the string is Panagram(The string should have all alphbates atleast once)

package com.jspider.programms;

import java.util.Scanner;

public class StringPanagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str =sc.nextLine();
		boolean rs=isPanagram(str);
		if(rs)
			System.out.println(str + " is panagram");
		else
			System.out.println(str + " is not a panagram");

	}
	static boolean isPanagram(String str)
	{
		if(str.length()<26)
			return false;

		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}
}



