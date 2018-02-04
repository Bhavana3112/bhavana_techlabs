package com.techlabs.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
	public static void main(String[] args)throws ClassNotFoundException {
		try {
			FileInputStream file = new FileInputStream("datafolder\\temp.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			SerialTest t1 = (SerialTest)in.readObject();
			

			in.close();
			file.close();

			System.out.println("Object has been deserialized");
			System.out.println("id = " + t1.id);
			System.out.println("name = " + t1.name);

		} catch (IOException ex) {
			System.out.println("Throws IOException");
		}

	}
}
