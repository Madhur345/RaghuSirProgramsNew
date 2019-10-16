package com.jspider.programms;
import java.util.Scanner;
public class Numtoword 
{
	static String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten",
			"eleven","tweleve","thirteen","fourteen","fifteeen","sixteeen","seventeen","eighteen","nineteen"};
	static String two[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eigty","ninety"};
	static void numToWord(int n,String st)
	{
		if(n<=19) {
			System.out.print(one[n]+" ");
		}
		else{
			System.out.print(two[n/10]+" "+one[n%10]+" ");
		}
		if(n!=0)
			System.out.print(st +" ");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		numToWord(num/10000000,"crore");
		numToWord((num/100000)%100,"lakh");
		numToWord((num/1000)%100,"thousand");
		numToWord((num/100)%10,"hundred");
		numToWord((num%100),"");
	}
}
