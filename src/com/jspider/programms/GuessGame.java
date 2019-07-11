package com.jspider.programms;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 0 to 9");
		int un = sc.nextInt();

		Random rd = new Random();
		int rn = rd.nextInt(10);

		if(un==rn){
			System.out.println("Guess is correct");
		}
		else{
			System.out.println("Guess is wrong ,It was " + rn);
		}
	}
}
