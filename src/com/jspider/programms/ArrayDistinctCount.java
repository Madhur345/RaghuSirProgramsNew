//WAP to count and return how many distinct element between 2 array;

package com.jspider.programms;

public class ArrayDistinctCount {
	public static void main(String[] args) {
		int a[]={23,45,32,56,67};
		int b[]={27,32,37,67};
		int k=countDistinct(a, b);
		System.out.println(k);
	}
	static int countDistinct(int a[],int b[]){
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			boolean fs = true;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					fs=false;
					break;
				}
			}
			if(fs)
			{
				count ++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			boolean fs = true;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					fs=false;
					break;
				}
			}
			if(fs)
			{
				count ++;
			}
		}
		return count;	
	}
}
