package com.techlabs.arraylist;

import java.io.Serializable;

public class ArraylistStudent implements Serializable {
	private int rollno;
	private String name;

	public ArraylistStudent(int rollno, String name) {
		this.rollno=rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
	    return "Student No: " + this.getRollno() + 
	           ", Student Name: " + this.getName();
	}

}
