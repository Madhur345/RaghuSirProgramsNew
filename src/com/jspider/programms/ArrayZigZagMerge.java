package com.jspider.programms;

import java.util.Scanner;

public class ArrayZigZagMerge {
	static int [] readArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements in Array");
		int n = sc.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter the values of " +n);
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		return ar;
	}

	public static void main(String[] args) {
		int a[]=readArray();
		int b[]=readArray();
		int c[]=mergeZigzag(a,b);
		System.out.println("Merged Array");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i] + " ");
		}
	}

	static int[] mergeZigzag(int x[],int y[]){
		int z[] =new int [x.length + y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length){
			z[k++]=x[i++];
			z[k++]=y[j++];
		}
		while(i<x.length){
			z[k++]=x[i++];
		}
		while(i<x.length){
			z[k++]=y[j++];
		}
		return z;
	}
}