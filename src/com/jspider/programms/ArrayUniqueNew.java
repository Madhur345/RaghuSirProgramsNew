package com.jspider.programms;

public class ArrayUniqueNew {
	public static void main(String[] args) {
		int a[]={23,45,32,56,67,45,32,45,89,67};
		int x[] =printUnique(a);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ " ");
		}
	}

	static int[] printUnique(int a[])
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
		}
		int na[] =new int[n];
		for(int i=0;i<n;i++)
		{
			na[i]=a[i];
		}
		return na;
	}
}
