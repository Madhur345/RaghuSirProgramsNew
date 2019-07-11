package com.jspider.programms;

public class ArmStrongMethod {

	boolean isArmStrong(int n){
		int c =	countdigits(n);
		int sum =0,t=n;
		do{
			int r = n%10;
			sum = sum + pow(r,c);
			n =n/10;
		}while(n!=0);
		return sum==t;
	}

	private int pow(int n, int p) {
		int pw=1;
		while(p>0){
			pw = pw*n;
			p--;
		}
		return pw;
	}

	private int countdigits(int n) {
		int count =0;
		do{
			count ++;
			n =n/10;
		}while(n!=0);
		return count;
	}
}