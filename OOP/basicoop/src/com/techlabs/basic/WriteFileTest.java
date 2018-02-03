package com.techlabs.basic;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) throws IOException {

		/*
		 * PrintWriter writer = new
		 * PrintWriter("C:\\Users\\Bhavana\\Desktop\\temp.txt", "UTF-8");
		 * writer.println("Hello world"); writer.close();
		 */

		FileWriter fname = new FileWriter(
				"C:\\Users\\Bhavana\\Desktop\\temp.txt", true);
		BufferedWriter out = new BufferedWriter(fname);
		out.write(" \n Hello world");
		out.close();

	}
}
