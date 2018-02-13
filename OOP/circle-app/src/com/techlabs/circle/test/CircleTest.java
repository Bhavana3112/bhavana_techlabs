package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1;
		c1 = new Circle();
		Circle c2 = new Circle();
		Circle temp = c1;
	
		c1.setColor("green");
		c2.setColor("Red");
		c1.setRadius(1.5f);
		c2.setRadius(2.5f);
		printDetails(c1);
		printDetails(c2);	

	}

	public static void printDetails(Circle circle) {
		
		
		System.out.println("radius = "+circle.getRadius() +" color= "+circle.getColor());
		System.out.println("area = " + circle.calcArea());
		System.out.println("Hashcode is = "+circle.hashCode());

	}
}
