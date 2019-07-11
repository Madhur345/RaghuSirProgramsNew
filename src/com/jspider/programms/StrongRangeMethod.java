//WAP to print what are the strong number between 1 to 100000


package com.jspider.programms;

public class StrongRangeMethod {
	public static void main(String[] args) {
		StrongNum sn = new StrongNum();
		for(int i =1;i<=100000;i++){
			boolean rs =sn.isStrong(i);
			if(rs==true){
				System.out.println(i + " is strong number");
			}
		}
	}
}

class StrongNum{
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
