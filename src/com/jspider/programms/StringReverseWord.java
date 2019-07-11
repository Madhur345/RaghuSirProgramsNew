//WAP to reverse the words in a sentence

package com.jspider.programms;

import java.util.Scanner;

public class StringReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str =sc.nextLine();
		char ch[] =str.toCharArray();
		String rs="";
		for(int i=0;i<ch.length;i++)
		{
			int j=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int k=i-1;
			while(k>=j)
			{
				rs = rs+ch[k];
				k--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		System.out.println(rs);
	}
}