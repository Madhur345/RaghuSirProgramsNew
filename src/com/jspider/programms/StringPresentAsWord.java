package com.jspider.programms;

import java.util.Scanner;

public class StringPresentAsWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Sentence");
		String str1 =sc.nextLine();
		System.out.println("Enter the 2nd Sentence");
		String str2=sc.nextLine();
		boolean rs=isPresentAsWord(str1,str2);
		if(rs)
			System.out.println(str2 + " is present in " +str1);
		else
			System.out.println(str2 + " is not present in " +str1);
	}

	static boolean isPresentAsWord(String str1, String str2) {
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			int j=0,k=i;
			while(j<c2.length && k<c1.length && c1[k]==c2[j])
			{
				k++;
				j++;
			}
			if(j==c2.length)
			{
				if(i==0||c1[i-1]==' '&& k==c1.length || c1[k]==' ')
					return true;;
			}

		}
		return false;
	}
}
