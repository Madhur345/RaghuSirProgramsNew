//WAP to define intersecation of 2 array elements;

package com.jspider.programms;

public class ArrayMinus {
	public static void main(String[] args) {
		int a[]={23,45,56,78,89,35};
		int b[]={42,56,32,45,89};
		int c[]=minus(a,b);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i] + " ");
		}
	}

	static int[] minus(int a[],int b[]){
		int c[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			boolean fs =true;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					fs=false;
					break;
				}
			}
			if(fs){
				c[k++]=a[i];
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
