package com.techlabs.set.test;

import java.util.LinkedHashSet;

import com.techlabs.set.Set;

public class LinkedSetTest {
	public static void main(String[] args) {
		booksadd();
		booksdelete();
		booksupdate();
	}

	public static void booksadd() {
		LinkedHashSet<Set> set = new LinkedHashSet<Set>();
		Set s1 = new Set(101, "The Notebook");
		Set s2 = new Set(102, "Rich Dad Poor Dad");
		set.add(s1);
		set.add(s2);
		for (Set s : set) {
			System.out.println("book id = " + s.getId() + " book name = "
					+ s.getName());
		}

	}

	public static void booksdelete() {
		LinkedHashSet<Set> set = new LinkedHashSet<Set>();
		Set s1 = new Set(101, "The Notebook");
		Set s2 = new Set(102, "Rich Dad Poor Dad");
		set.add(s1);
		set.add(s2);
		for (Set s : set) {
			System.out.println("book id = " + s.getId() + " book name = "
					+ s.getName());
		}
		set.remove(s2);
		System.out.println("After deletion:");
		for (Set s : set) {
			System.out.println("book id = " + s.getId() + " book name = "
					+ s.getName());
		}

	}

	public static void booksupdate() {
		LinkedHashSet<Set> set = new LinkedHashSet<Set>();
		Set s1 = new Set(101, "The Notebook");
		Set s2 = new Set(102, "Rich Dad Poor Dad");
		set.add(s1);
		set.add(s2);
		for (Set s : set) {
			System.out.println("book id = " + s.getId() + " book name = "
					+ s.getName());
		}
		Set s3 = new Set(103, "Immortals of Meluha");
		set.add(s3);
		System.out.println("After Update:");
		for (Set s : set) {
			System.out.println("book id = " + s.getId() + " book name = "
					+ s.getName());
		}

	}

}
