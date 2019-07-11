//Define a method to returns how many words present in the sentence
//convert all vowel to uppercase

package com.jspider.programms;

import java.util.Scanner;

public class StringWordCountInSentenece {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		char ch[]= str.toCharArray();
		int wc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				wc++;
		}
		System.out.println(wc);
	}
}