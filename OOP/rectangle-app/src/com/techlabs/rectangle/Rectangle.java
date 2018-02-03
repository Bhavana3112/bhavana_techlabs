package com.techlabs.rectangle;

public class Rectangle {
	private int width, height;

	private int validateRange(int dimension) {
		if (dimension < 10)
			return 10;
		else if (dimension > 100)
			return 100;
		else
			return dimension;
	}

	public void setWidth(int pwidth) {
		width = validateRange(pwidth);
	}

	public void setHeight(int pheight) {
		height = validateRange(pheight);
	}

	public int calculateArea() {

		return width * height;
	}
}
