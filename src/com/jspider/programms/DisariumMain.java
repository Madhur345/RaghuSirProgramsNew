package com.jspider.programms;

public class DisariumMain {
	public static void main(String[] args) {
		DisariumNumber dn = new DisariumNumber();
		for(int i=1;i<=1000000;i++)
		{
			boolean fs =dn.isDisarium(i);
			if(fs)
			{
				System.out.println(i + " ");
			}
		}
	}
}
