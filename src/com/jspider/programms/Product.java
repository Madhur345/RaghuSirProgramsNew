package com.jspider.programms;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the product");
		String st = sc.next();
		System.out.println("Emter the price of the product");
		int price = sc.nextInt();
		System.out.println("Enter the money");
		int money = sc.nextInt();
		System.out.println("You can purchase " + money/price+" "+st+" Product");
		System.out.println("You have to collect the change Rs " + money%price);
		}
}
