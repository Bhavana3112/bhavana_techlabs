package com.techlabs.test;

import com.techlabs.rectangle.Rectangle;
import com.techlabs.rectangle.borderstyle.BorderStyleOptions;

public class RectangleTest {
	public static void main (String[] args){
		Rectangle r1 = new Rectangle(10, 20,BorderStyleOptions.DOTTED);
		Rectangle r2 = new Rectangle(30, 40);
		printDetails(r1);
		printDetails(r2);
		
	}

	public static void printDetails(Rectangle rect ){
		System.out.println("width = "+rect.getWidth() +" height= " +rect.getHeight() 
				+ " color= " +rect.getBorder());
		System.out.println("area = " +rect.calcArea());
	}

	
	
}