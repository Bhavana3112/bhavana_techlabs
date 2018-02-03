package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1;
		
		r1 = new Rectangle();
		r1.setHeight(11);
		r1.setWidth(105);
		System.out.println("area= " + r1.calculateArea());

	}
}
