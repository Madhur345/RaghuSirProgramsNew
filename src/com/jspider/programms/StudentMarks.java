package com.jspider.programms;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 subject marks");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();

		if(m1<35||m2<35||m3<35||m4<35){
			System.out.println("Result : Fail");
		}
		else{
			double per =(m1+m2+m3+m4)/4.0;
			if(per>85){
				System.out.println("Result : Distinction");
			}
			else if(per>60){
				System.out.println("Result : First class");
			}
			else if(per>50){
				System.out.println("Result : Second class");
			}
			else{
				System.out.println("Result : Pass");
			}
		}
	}
}
