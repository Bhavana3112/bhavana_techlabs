package com.techlabs.rectangle;

import com.techlabs.rectangle.borderstyle.BorderStyleOptions;

public class Rectangle {
	private int width;
	private int height;
	private static BorderStyleOptions border = BorderStyleOptions.SINGLE;

	public Rectangle(int width, int height, BorderStyleOptions border) {
		this.width = width;
		this.height = height;
		this.border = border;
	}

	public Rectangle(int width, int height) {
		this(width, height, border);

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BorderStyleOptions getBorder() {
		return border;
	}

	public int calcArea() {
		return width * height;

	}
}
