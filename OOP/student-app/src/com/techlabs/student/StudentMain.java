package com.techlabs.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	StudentStore studentobj;

	public StudentMain(StudentStore obj) {
		studentobj = obj;
	}

	private static Scanner input;
	private static final int ADD_CHOICE = 1;
	private static final int DISPLAY_CHOICE = 2;
	
	public void start() {

		input = new Scanner(System.in);
		System.out.println("Press 1 to add Student");
		System.out.println("Press 2 to Display Students");

		int choice = Integer.parseInt(input.nextLine());

		switch (choice) {
		case ADD_CHOICE:
			getDetails();
			break;
		case DISPLAY_CHOICE:
			print(studentobj.get());
			break;
		}

	}

	@SuppressWarnings("unused")
	public void getDetails() {
		List<Student> studentlist = new ArrayList<Student>();

		do {
			System.out.println("Enter Student ID :");
			int id = Integer.parseInt(input.nextLine());

			System.out.println("Enter Student Name :");
			String name = input.nextLine();

			System.out.println("Enter Student Marks :");
			int marks = Integer.parseInt(input.nextLine());

			Student student = new Student(id, name, marks);
			((StudentStore) studentobj).add(student);

			System.out.println("Your details are being saved.");
			System.out.println("Press 1 to add more Student");
			System.out.println("Any Other number to exit");

		} while (Integer.parseInt(input.nextLine()) == ADD_CHOICE);
		start();
	}

	public void print(List<Student> list) {
		for (Student student : list) {
			System.out.println("Student Id:" + student.getId());
			System.out.println("Student Name:" + student.getName());
			System.out.println("Student Marks:" + student.getMarks());
		}
	}

}
