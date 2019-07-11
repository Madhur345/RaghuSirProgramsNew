package com.jspider.programms;

import java.util.Scanner;

public class DayNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day num");
		int dayNum = sc.nextInt();

		if(dayNum == 1){
			System.out.println("Sunday");
		}
		else if(dayNum == 2){
			System.out.println("Monday");
		}
		else if(dayNum == 3){
			System.out.println("Tuesday");
		}
		else if(dayNum == 4){
			System.out.println("Wednesday");
		}
		else if(dayNum == 5){
			System.out.println("Thrusday");
		}
		else if(dayNum == 6){
			System.out.println("Friday");
		}
		else if(dayNum == 7){
			System.out.println("Saturday");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
