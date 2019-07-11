package com.jspider.programms;

public class ArrayUnion {

	public static void main(String[] args) {
		int a[]={23,45,32,56,67};
		int b[]={27,32,37,67};
		int x[]=union(a,b);
		for (int i=0;i<x.length;i++){
			System.out.print(x[i]+ " ");
		}
	}

	static int[] union(int a[],int b[]){
		int c[] =new int[a.length + b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int k =a.length;
		for(int i=0;i<b.length;i++)
		{
			boolean fs =true;
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
				c[k++]=b[i];
			}
		}
		int rs[]=new int[k];
		for(int i=0;i<k;i++)
		{
			rs[i]=c[i];
		}
		return rs;
	}
}
