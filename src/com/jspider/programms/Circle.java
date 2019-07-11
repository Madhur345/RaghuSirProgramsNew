// WAP to difine a method to calculate and display the area and circumference of circles with following radius
//6.7,8.9,1.6,14

package com.jspider.programms;

public class Circle {
	static double r1=6.7,r2=8.9,r3=1.6,r4=14;
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.printCircleArea(r1);
		c1.printCircleArea(r2);
		c1.printCircleArea(r3);	
		c1.printCircleArea(r4);
	}
	void printCircleArea(double r){
		double ar =3.143*r*r;
		System.out.println("Area of circle with radius "+r+" is "+ar);
		double cr =2*3.143*r;
		System.out.println("Circumference of circle with radius "+r+" is "+cr);


	}
}
