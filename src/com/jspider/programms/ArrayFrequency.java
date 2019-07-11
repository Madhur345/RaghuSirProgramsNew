//WAP to display the number of frequency in a array.

package com.jspider.programms;

public class ArrayFrequency {
	public static void main(String[] args) {
		int a[]={23,45,32,56,67,45,32,45,89,30};
		countFrequency(a);
	}

	static void countFrequency(int a[]){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!= -1)
			{
				int count =1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						a[i]=-1;
					}
				}
				System.out.println(a[i]+ "----------"+ count);
			}
		}
	}
}
