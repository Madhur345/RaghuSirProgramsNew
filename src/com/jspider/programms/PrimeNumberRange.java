package com.jspider.programms;

import java.util.Scanner;

public class PrimeNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Prime p = new Prime();
		System.out.println("Prime number between " + n + " is ");
		for(int i=1;i<=n/2;i++){
			boolean fs = p.isPrime(i);
			if(fs){
				System.out.print(i+" ");
			}
		}
	}
}


class Prime{
	boolean isPrime(int n){
		int i =1;
		int count =1;
		while(i<=n/2){
			if(n%i==0){
				count ++;
			}
			if(count>2){
				break;
			}
			i++;
		}
		if(count==2){
			return true;
		}
		else{
			return false;
		}
	}
}