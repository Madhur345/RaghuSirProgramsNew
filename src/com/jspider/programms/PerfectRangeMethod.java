package com.jspider.programms;

import java.util.Scanner;

public class PerfectRangeMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Perfect p = new Perfect();
		for(int i=1;i<=n;i++){
			boolean fs=p.isPerfect(i);
			if(fs){
				System.out.println(i + " is a perfect number");
			}
		}
	}
}

class Perfect{
	boolean isPerfect(int n){
		int i =1;
		int sum=0;
		while(i<=n/2){
			if(n%i==0){
				sum = sum +i;
			}
			i++;
		}
		if(sum==n){
			return true;
		}
		else{
			return false;
		}
	}
}