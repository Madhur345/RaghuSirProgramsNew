//WAP to solve lift floor problem,lift can carry maximum 9 people and total weight of 750

package com.jspider.programms;

import java.util.Scanner;

public class LiftFloor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of persons");
		int n = sc.nextInt();
		if(n>9){
			System.out.println("only 9 persons are allowed in the lift");
		}
		else{
			double w[]=new double[n];
			double sum =0;
			for(int i=0;i<n;i++){
				System.out.println("Enter the weight of "+(i+1)+" person");
				w[i]=sc.nextDouble();
				sum = sum  +w[i];
			}
			if(sum>750){
				System.out.println("Lift is overloaded as total weight of "+ n+" person is " + sum);
			}
			else{
				System.out.println("Lift is working as total weight of "+ n+" person is " + sum);
			}
		}
	}
}