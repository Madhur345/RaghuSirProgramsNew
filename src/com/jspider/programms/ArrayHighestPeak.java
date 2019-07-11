//Define a method to return highest peak element from the array;(peak elemets are greater than their neigbour)

package com.jspider.programms;

public class ArrayHighestPeak {
	public static void main(String[] args) {
		int a[]={23,45,38,78,89,85};
		int k=highestPeak(a);
		System.out.println(k);
	}

	static int highestPeak(int a[]){
		int hp=-1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1] && a[i]> a[i+1])
			{
				if(hp<a[i])
				{
					hp =a[i];
				}
			}
		}
		return hp;
	}
}