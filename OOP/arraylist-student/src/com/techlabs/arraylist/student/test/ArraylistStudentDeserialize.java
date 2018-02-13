package com.techlabs.arraylist.student.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.arraylist.ArraylistStudent;

public class ArraylistStudentDeserialize {
	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("datafolder2\\temp2.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			ArrayList<ArraylistStudent> al = (ArrayList<ArraylistStudent>)in.readObject();
			in.close();
			fin.close();
			System.out.println("Object has been deserialized");

			for (ArraylistStudent list : al) {
				System.out.println(list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
