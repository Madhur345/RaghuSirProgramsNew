//WAP to define method to find power of a number

package com.jspider.programms;

public class PowerMethod {

	static int pow(int n,int p){
		int pw =1;
		while(p>0){
			pw =pw*n;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) {
		System.out.println(pow(5, 4));
	}
}

