package com.techlabs.student.test;

import java.io.FileNotFoundException;
import java.util.List;

import com.techlabs.student.Student;
import com.techlabs.student.StudentExport;
import com.techlabs.student.StudentMain;
import com.techlabs.student.StudentStoreMethods;

public class StudentTest {
	public static void main(String[] args)throws FileNotFoundException {
		StudentMain student = new StudentMain(new StudentExport());
		student.start();

		StudentMain s = new StudentMain(new StudentExport());
		s.start();

		StudentStoreMethods studentcsv = new StudentStoreMethods();
		print(studentcsv.get());

	}

	private static void print(List<Student> list) {
		for (Student student : list) {
			System.out.println("Student Id:" + student.getId());
			System.out.println("Student Name:" + student.getName());
			System.out.println("Student Marks:" + student.getMarks());
		}

	}
}