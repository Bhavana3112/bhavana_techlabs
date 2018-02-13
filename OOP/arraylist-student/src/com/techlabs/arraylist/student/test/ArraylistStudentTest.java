package com.techlabs.arraylist.student.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.arraylist.ArraylistStudent;

public class ArraylistStudentTest {
	public static void main(String[] args) {
		ArraylistStudent s1 = new ArraylistStudent(10, "abc");
		ArraylistStudent s2 = new ArraylistStudent(20, "xyz");

		ArrayList<ArraylistStudent> al = new ArrayList<ArraylistStudent>();
		al.add(s1);
		al.add(s2);

		try {
			FileOutputStream fout = new FileOutputStream(
					"datafolder2\\temp2.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(al);
			out.close();
			fout.close();
			System.out.println("Object has been serailized");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
