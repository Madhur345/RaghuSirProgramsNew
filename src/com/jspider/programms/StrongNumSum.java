//WAP to print what are the sum of strong number between 1 to 100000
package com.jspider.programms;

public class StrongNumSum {
	public static void main(String[] args) {
		StrongNumS ss = new StrongNumS();
		int sum =0;
		for(int i=1;i<=100000;i++){
			boolean rs =ss.isStrong(i);
			if(rs){
				sum = sum +i;
			}
		}
		System.out.println("sum of strong number upto 100000 is " + sum);
	}
}

class StrongNumS{
	boolean isStrong(int n){
		int sum =0,t=n;
		do{
			int r =n%10;
			sum =sum + fact(r);
			n=n/10;
		}
		while(n!=0);
		if(sum==t){
			return true;
		}else{
			return false;
		}
	}
	int fact(int n) {
		int f =1;
		while(n>1){
			f=f*n;
			n--;
		}
		return f;
	}
}
