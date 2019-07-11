//WAP to reverse the elements of array;

package com.jspider.programms;

public class ArrayReverse {
	public static void main(String[] args) {
		int x[]={28,32,39,24,56,19};
		int y[]=reverse(x);
		for(int i=0;i<y.length;i++){
			System.out.print(y[i] + " ");
		}
	}

	private static int[] reverse(int[] a) {
		for(int i=0;i<a.length/2;i++){
			int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		return a;
	}
}
