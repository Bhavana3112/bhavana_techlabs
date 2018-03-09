package com.techlabs.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentExport implements StudentStore{
		private List<Student> studentlist;

		public StudentExport() {
			init();
			studentlist = new ArrayList<Student>();
		}

		@SuppressWarnings({ "resource", "unchecked" })
		public void init() {
			try {
				FileInputStream fs = new FileInputStream("studentdata.ser");
				studentlist = ((List<Student>) new ObjectInputStream(fs)
						.readObject());
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
			studentlist.add(student);
			save();
		}

		private void save() {
			try {
				FileOutputStream fos = new FileOutputStream("studentdata.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(studentlist);
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
