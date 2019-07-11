//WAP to convert every word 1st char to upercase and remaning cahr to lowercase(INITCAP)

package com.jspider.programms;

import java.util.Scanner;

public class StringUpperLowerCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =s.nextLine();
		String ic =initCap(str);
		System.out.println(ic);
	}

	static String initCap(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		str = new String(ch);
		return str;
	}
}


