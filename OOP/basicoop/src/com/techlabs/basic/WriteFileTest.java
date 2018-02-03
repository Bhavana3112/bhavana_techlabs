package com.techlabs.basic;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) throws IOException {
		FileWriter fname = new FileWriter("datafolder\\temp.txt", true);
		BufferedWriter out = new BufferedWriter(fname);
		out.write(" \n Hello world");
		out.close();

	}
}
