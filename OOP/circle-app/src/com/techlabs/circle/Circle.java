package com.techlabs.circle;

public class Circle {
	private float radius;
	private float pi = 3.14f;
	private String color;

	public void setRadius(float pradius) {
		radius = pradius;
	}

	public float getRadius() {
		return radius;

	}

	public void setColor(String pcolor) {
		if (pcolor.equalsIgnoreCase("red") || pcolor.equalsIgnoreCase("RED")
				|| pcolor.equalsIgnoreCase("Red")) {
			color = pcolor;
		}

	}

	public String getColor() {
		return color;
	}

	public float calcArea() {
		return pi * radius * radius;

	}

}
