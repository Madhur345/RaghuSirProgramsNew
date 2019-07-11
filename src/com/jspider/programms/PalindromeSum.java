//WAP to define method to find palindrome between 1 to 10000

package com.jspider.programms;

public class PalindromeSum {
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		for(int i=1;i<=1000;i++){
			boolean rs =p.isPalindrome(i);
			if (rs){
				System.out.println(i + " is is palindrome");
			}
		}
	}

}
class Palindrome{
	boolean isPalindrome(int n){
		int rev =0;
		int t =n;
		do{
			int r = n%10;
			rev = rev *10+r;
			n = n/10;
		}
		while(n!=0);
		if(rev==t){
			return true;
		}
		else{
			return false;
		}
	}
}