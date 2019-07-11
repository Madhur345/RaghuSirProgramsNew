//WAP to difine a methods to display the area and parameter of a Rectangle&Square.

package com.jspider.programms;

import java.util.Scanner;

public class RectangleAndSquare {
	public static void main(String[] args) {
		Shapes sp = new Shapes();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the Square");
		double s = sc.nextDouble();
		System.out.println("Enter the length and width of the shapes");
		double l = sc.nextDouble();
		double w = sc.nextDouble();
		sp.printSquareArea(s);
		sp.printRectangleArea(l, w);
	}
}

class Shapes{
	void printSquareArea(double side){
		double area = side * side;
		double par = 4*side;
		System.out.println("Area of a square with side "+ side +" : " + area);
		System.out.println("Area of a square with side "+ side +" : " + par);
} 
	void printRectangleArea(double length,double width){
		double area = length* width;
		double par = 2*(length+width);
		System.out.println("Area of a square with side "+ length+ " & " +width +" : " + area);
		System.out.println("Area of a square with side "+ length+ " & "+width +" : " + par);
}
}