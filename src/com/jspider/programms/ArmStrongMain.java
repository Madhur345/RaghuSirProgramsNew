package com.jspider.programms;

import java.util.Scanner;

public class ArmStrongMain {
	public static void main(String[] args) {
		//		ArmStrongMethod am = new ArmStrongMethod();
		//		System.out.println("Arm strong number between 1 to 10000 are ");
		//		for(int i=1;i<=100000;i++ ){
		//			boolean fs=am.isArmStrong(i);
		//			if(fs){
		//				System.out.print(i+ " ");
		//			}
		//		}
		//	}
		ArmStrongMethod am = new ArmStrongMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean fs=am.isArmStrong(n);
		if(fs){
			System.out.println(n + " is a armstrong number");
		}
		else{
			System.out.println(n + " is not a armstrong number");
		}
	}
}

