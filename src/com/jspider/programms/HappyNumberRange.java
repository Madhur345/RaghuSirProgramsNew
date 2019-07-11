package com.jspider.programms;

import java.util.Scanner;

public class HappyNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
		HappyNumber hn = new HappyNumber();
		System.out.println("Happy Number are");
		for(int i =1;i<=n;i++){
			boolean rs = hn.isHappy(i);
			if(rs==true){
				System.out.print(i + " ");
			}
		}
	}
}


