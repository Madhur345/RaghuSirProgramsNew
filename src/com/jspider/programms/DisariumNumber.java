package com.jspider.programms;

public class DisariumNumber {
	boolean isDisarium(int n)
	{
		int c = countDigits(n);
		int sum =0,t=n;
		do{
			int r = n%10;
			sum = sum + pow(r,c);
			n=n/10;
			c--;
		}while(n!=0);
		return sum==t;
	}

	int countDigits(int x)
	{
		int  count =0;
		do
		{
			count ++;
			x=x/10;
		}while(x!=0);
		return count;
	}

	int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw =pw *n;
			p--;
		}
		return pw;
	}

}

