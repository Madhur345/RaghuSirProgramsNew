//WAP to merge 2 shorted array in shorted format;

package com.jspider.programms;

import java.util.Scanner;

public class ArrayShortedMerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements first Array");
		int n1 = sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter " +n1+ " values");
		for(int i=0;i<n1;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements 2nd Array ");
		int n2 = sc.nextInt();
		int b[]=new int[n2];
		System.out.println("Enter "+n2+ "values");
		for(int i=0;i<n2;i++){
			b[i] = sc.nextInt();
		}
		int c[]=mergeSort(a,b);
		System.out.println("Merged Array Elements :");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+ " ");
		}
	}
	static int[]mergeSort(int x[],int y[]){
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length){
			if(x[i]<y[j])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		while(i<x.length){
			z[k++]=x[i++];
		}
		while(j<y.length){
			z[k++]=y[j++];
		}
		return z;
	}
}
