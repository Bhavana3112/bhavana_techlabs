package com.techlabs.array;

public class TestNumber {
	public static void main(String[] args) {
		int mark = 100;
		changeMarkToZero(mark);
		System.out.println(mark);

		int[] marks = { 80, 90, 100 };
		changeMarksToZero(marks);
		for (int m : marks) {
			System.out.println(m);
		}
		System.out.println(marks);
	}

	static void changeMarkToZero(int pmark) {
		pmark = 0;
	}

	static void changeMarksToZero(int[] pmarks) {
		for (int i = 0; i < pmarks.length; i++) {
			pmarks[i] = 0;
		}
		System.out.println(pmarks);
	}
}
