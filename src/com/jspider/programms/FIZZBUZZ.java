//WAP to display "FIZZ" if number is divisable by 3,display "BUZZ" if number is disible by 5 and display
//FIZZ and BUZZ if the number is divisable by both 3 and 5,ortherwise don't display anything between 1 to 100;

package com.jspider.programms;


public class FIZZBUZZ {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%3==0 && i%5==0)
				System.out.println(i + " Fizz Buzz");
			if(i%3==0)
				System.out.println(i + " Fizz");
			if(i%5==0)
				System.out.println(i + " Buzz");
		}
	}
}
