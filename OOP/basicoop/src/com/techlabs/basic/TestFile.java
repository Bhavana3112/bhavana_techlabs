package com.techlabs.basic;

import java.io.*;

public class TestFile {

	public static void main(String[] args) throws Exception {
		File file = new File("datafolder\\temp.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}

}