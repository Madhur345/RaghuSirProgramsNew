//WAP to define a method to check the number is happy number or not.

package com.jspider.programms;

public class HappyNumber {
	boolean isHappy(int n){
		while(n>9){
			int sum =0;
			do{
				int r = n%10;
				sum = sum  + r*r;
				n =n/10;
			}while(n!=0);
			n=sum;
		}
		if(n==1||n==7){
			return true;
		}else{
			return false;
		}
	}
}
