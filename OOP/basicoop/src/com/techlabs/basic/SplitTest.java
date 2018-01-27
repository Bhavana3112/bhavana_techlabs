package com.techlabs.basic;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;

public class SplitTest {

	public static void main(String args[]) {

		String s = "www.swabhavtechlabs.com?developer=abc";

		String[] parts = s.split("(\\.|\\.)|\\?");

		/*
		 * for(String p : parts){ System.out.println(p); }
		 */

		String str1 = parts[0]; // www
		String str2 = parts[1]; // swabhavtechlabs
		String str3 = parts[2]; // com
		String str4 = parts[3]; // developer=abc

		System.out.println(str2);
		System.out.println(str4);

	}
}