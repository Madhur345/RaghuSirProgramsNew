package com.jspider.programms;

public class ArrayFrequencyNew {
	public static void main(String[] args) {
		int a[]={23,45,32,56,67,45,32,45,89,67};
		frequency(a);

	}
	static void frequency(int a[])
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			int count =1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			System.out.println(a[i] +"----------" +count);
		}
	}
}
