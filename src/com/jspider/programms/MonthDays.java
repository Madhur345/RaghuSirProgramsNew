package com.jspider.programms;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month number");
		int dayMonth = sc.nextInt();
		switch(dayMonth){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("No of days is 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("No of days is 30");
			break;
		case 2:
			System.out.println("No of days is 28 or 29");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
