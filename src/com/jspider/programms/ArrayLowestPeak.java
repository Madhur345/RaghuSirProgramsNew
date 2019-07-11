package com.jspider.programms;

public class ArrayLowestPeak {
	public static void main(String[] args) {
		int a[]={23,45,38,78,89,85};
		int t =lowestPeak(a);
		System.out.println(t);
	}

	static int lowestPeak(int a[])
	{
		int lp=-1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				if(lp>a[i] || lp ==-1)
				{
					lp=a[i];
				}
			}
		}
		return lp;
	}
}
