//WAP to define a method to merge two array elements into single array;

package com.jspider.programms;

import java.util.Scanner;

public class ArrayMerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of 1st Array");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter the values of " +n1);
		for(int i=0;i<n1;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements of 2nd Array");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		System.out.println("Enter the values of " +n2);
		for(int i=0;i<n2;i++){
			b[i]=sc.nextInt();
		}
		int c[]=merge(a,b);
		System.out.println("Elements of Merged Array");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i] + " ");
		}
	}
	static int[] merge(int x[],int y[]){
		int z[]=new int[x.length +y.length];
		for(int i=0;i<x.length;i++){
			z[i] =x[i];
		}
		for(int i=0;i<y.length;i++){
			z[x.length +i] =y[i];
		}
		return z;
	}
}


