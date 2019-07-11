//WAP to convert binary to decimal.

package com.jspider.programms;

public class BinaryDecimal {
	int binToDecimal(int bin){
		int dec=0,p=0;
		do{
			int r = bin/10;
			dec = dec + r*pow(2,p);
			bin  =bin/10;
			p++;
		}while(bin!=0);
		return dec;
	}

	int pow(int n, int p) {
		int pw=1;
		while(p>0)
		{
			pw =pw*n;
			p--;
		}
		return pw;
	}
}

