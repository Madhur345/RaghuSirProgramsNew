//WAP to define intersecation of 2 array elements;
//WAP to print 1st biggest and 2nd biggest element without sorting;


package com.jspider.programms;

public class Array1sttAnd2ndBiggest {
	public static void main(String[] args) {
		int a[]={23,45,56,78,89,85};
		int fbig =a[0];
		int sbig=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fbig)
			{
				sbig =fbig;
				fbig=a[i];
			}
			else if(a[i]>sbig)
			{
				sbig=a[i];
			}
		}
		System.out.println("Ist biggest array element is : " + fbig);
		System.out.println("Ist biggest array element is : " + sbig);
	}
}
