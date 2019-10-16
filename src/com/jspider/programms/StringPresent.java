//WAP to check if one string is present in another

package com.jspider.programms;

import java.util.Scanner;

public class StringPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st sentence");
		String str1=sc.nextLine();
		System.out.println("Enter the 1st sentence");
		String str2=sc.nextLine();
		boolean rs=isPresent(str1,str2);
		if(rs){
			System.out.println(str2 +" is present in " + str1);
		}
		else{
			System.out.println(str2 +" is not present in " + str1);
		}
	}

	static	boolean  isPresent(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			int j=0;
			
			while(j<c2.length && i<c1.length && c1[i]==c2[j])
			{
				i++;
				j++;
			}
			if(j==c2.length)
				return true;
		}
		return false;
	}
}
