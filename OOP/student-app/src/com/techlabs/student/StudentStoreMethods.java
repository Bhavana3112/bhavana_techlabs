package com.techlabs.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "resource" })
public class StudentStoreMethods implements StudentStore {
	private ArrayList<Student> studentlist;

	public StudentStoreMethods() {
		init();
		studentlist = new ArrayList<Student>();
	}

	public void init() {
		try {

			FileReader fr = new FileReader("datafolder\\studentdata.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] studentarray = line.split(",");
				studentlist.add(new Student(Integer.parseInt(studentarray[0]),
						studentarray[1], Integer.parseInt(studentarray[2])));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> get() {
		return studentlist;
	}

	@Override
	public void add(Student student) {
		try {
			studentlist.add(student);
			save();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void save() {
		try {

			BufferedWriter fos = new BufferedWriter(new FileWriter(
					"studentdata.csv"));
			for (Student student : studentlist) {
				String temp = student.getId() + "," + student.getName() + ","
						+ student.getMarks();
				fos.append(temp);
				fos.newLine();

			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
