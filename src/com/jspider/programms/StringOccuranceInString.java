//WAP to check if one string is present in another

package com.jspider.programms;

import java.util.Scanner;

public class StringOccuranceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st sentence");
		String str1=sc.nextLine();
		System.out.println("Enter the 2nd sentence");
		String str2 =sc.nextLine();
		int k = isPresent(str1,str2);
		System.out.println(k);
	}
	static int isPresent(String str1,String str2)
	{
		int count =0;
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			int j=0,k=i;
			while(j<c2.length && k<c1.length && c1[k]==c2[j])
			{
				k++;
				j++;
			}
			if(j==c2.length)
			{
				count++;
				i =k-1;
			}
		}
		return count;
	}
}