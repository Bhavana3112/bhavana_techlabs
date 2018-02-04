package com.techlabs.basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialTest implements Serializable {
	int id;
	String name;

	public SerialTest(int id, String name) {
		this.id = id;
		this.name = name;

	}

}

public class SerializationTest {
	public static void main(String[] args) {
		try {
			SerialTest t1 = new SerialTest(10, "abc");
			FileOutputStream fout = new FileOutputStream("datafolder\\temp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(t1);
			out.flush();
			System.out.println("Object has been serailized");
		}

		catch (IOException ex) {
			System.out.println("Throws IOException");

		}

	}
}
