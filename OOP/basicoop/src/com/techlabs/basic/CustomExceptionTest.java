package com.techlabs.basic;

import java.util.Scanner;

class OddnumException extends Exception {
	OddnumException() {
		super("Odd number exception");
	}

	OddnumException(String msg) {
		super(msg);
	}
}

public class CustomExceptionTest {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = Integer.parseInt(sc.nextLine());
		try {
			if (num % 2 != 0) {
				throw (new OddnumException());

			}

			else {
				System.out.println(+num + "is even number");
			}
		} catch (OddnumException e) {
			System.out.println("Error " + e.getMessage());

		}

	}
}
