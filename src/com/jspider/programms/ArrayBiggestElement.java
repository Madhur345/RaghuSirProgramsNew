//WAP to define a method to return biggest element from the array;

package com.jspider.programms;

import java.util.Scanner;

public class ArrayBiggestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the number of elements");
		int n =sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the value of " +n);
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		int big =getBiggest(ar);
		System.out.println("The biggest number is " + big);
	}

	static int getBiggest(int[] a) {
		int big= a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>big){
				big =a[i];
			}
		}
		return big;
	}
}
