//WAP to print what are the count of  strong number between 1 to 100000


package com.jspider.programms;

public class StrongNumberCount {
	public static void main(String[] args) {
		StrongNumC sc = new StrongNumC();
		int count =0;
		for(int i=1;i<=100000;i++){
			boolean rs =sc.isStrong(i);
			if(rs==true){
				count++;
			}
		}
		System.out.println("Count of Strong number upto 100000 is " + count);
	}
}

class StrongNumC{
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

