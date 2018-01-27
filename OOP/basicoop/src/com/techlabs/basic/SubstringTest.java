package com.techlabs.basic;

import java.io.*;
import java.util.*;
import java.lang.*;

public class SubstringTest {
	public static void main(String args[]) {
		String s = "www.swabhavtechlabs.com?developer=abc";
		int a = s.indexOf(".") + 1;
		int b = s.lastIndexOf(".");

		System.out.println(s.substring(a, b));
		a = s.indexOf("?") + 1;
		System.out.println(s.substring(a));

	}
}
