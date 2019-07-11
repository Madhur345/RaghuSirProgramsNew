//WAP to check if one string is present in another

package com.jspider.programms;

import java.util.Scanner;

public class StringOccuranceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Sentence");
		String str1 =sc.nextLine();
		System.out.println("Enter the 2nd Sentence");
		String str2=sc.nextLine();
		isPresent(str1,str2);
		System.out.println("Occurance of " + str2 + " in " +str1 +" is " + isPresent(str1, str2));
	}

	static int isPresent(String str1, String str2) {
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		int count =0;
		for(int i=0;i<c1.length;i++){
			int j=0,k=i;
			while(j<c2.length && k<c1.length && c1[k]==c2[j])
			{
				k++;
				j++;
			}
			if(j==c2.length)
				count++;
			i=k-1;
		}
		return count;
	}

}