package com.jspider.programms;

public class ArrayInsertMultiple {
	public static void main(String[] args) {
		int x[]={28,32,39,24,56,19};
		int y[]={33,44,27};
		x=insertArray(x,y,2);
		System.out.println("Modified Array :");
		for(int i=0;i<x.length;i++){
			System.out.print(x[i] + " ");
		}
	}

	static int[] insertArray(int a[],int b[],int in){
		if(in<0||in>a.length)
		{
			System.out.println("Array Index out of range");
			return a;
		}
		int c[]=new int[a.length+b.length];
		for(int i=0;i<b.length;i++)
		{
			c[in+i]=b[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i<in)
			{
				c[i]=a[i];
			}
			else{
				c[i+b.length]=a[i];
			}
		}
		return c;
	}
}