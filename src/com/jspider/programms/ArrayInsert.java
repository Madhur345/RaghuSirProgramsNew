package com.jspider.programms;

public class ArrayInsert {
	public static void main(String[] args) {
		int x[]={23,45,34,56,28,75};
		int y[]=insertArr(x,15,2);
		System.out.println("Enter The Actual Array");
		for(int i=0;i<x.length;i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("Enter The Modified Array");
		for(int i=0;i<y.length;i++){
			System.out.print(y[i] + " ");
		}
	}

	static int[] insertArr(int a[],int ele,int in){
		if(in<0||in>=a.length){
			System.out.println("Index is not in the range");
			return a;
		}
		int b[] =new int[a.length +1];
			b[in]=ele;
		for(int i=0;i<a.length;i++){
			if(i<in){
				b[i]=a[i];
			}
			else{
				b[i+1]=a[i];
			}
		}
		return b;
	}
}
