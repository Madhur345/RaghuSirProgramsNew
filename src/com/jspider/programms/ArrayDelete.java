//WAP to delete the elements from the specified index.

package com.jspider.programms;

public class ArrayDelete {
	public static void main(String[] args) {
		int x[]={23,45,34,56,28,75};
		x=deleteArr(x,2);
		System.out.println("Modified Array");
		for(int i=0;i<x.length;i++){
			System.out.print(x[i] + " ");
		}
	}
	
	static int[] deleteArr(int a[],int in){
		if(in<0 || in>=a.length){
			System.out.println("Index not in range");
			return a;
		}
		int b[] = new int[a.length-1];
		for(int i=0;i<a.length-1;i++){
			if(i<in){
				b[i]=a[i];
			}
			else{
				b[i]=a[i+1];
			}
		}
		return b;
	}
}
