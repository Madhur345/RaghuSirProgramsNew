//WAP to define intersecation of 2 array elements

package com.jspider.programms;

public class ArrayIntersection {
	public static void main(String[] args) {
		int a[]={23,45,56,78,89,35};
		int b[]={42,56,32,45,89};
		int c[]=intersectionArr(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] + " ");
		}
	}

	static int[] intersectionArr(int a[],int b[]){
		int c[] =new int [a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k++]=a[i];
					break;
				}
			}
		}
		int rs[]=new int [k];
		for(int i=0;i<k;i++)
		{
			rs[i]=c[i];
		}
		return rs;

	}
}