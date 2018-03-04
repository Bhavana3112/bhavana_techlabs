package com.techlabs.set.test;

import java.util.TreeSet;

import com.techlabs.set.Set;

public class TreeSetTest {
	public static void main(String[] args) {
		employeeadd();
		employeedelete();
		employeeupdate();

	}

	public static void employeeadd() {
		TreeSet<Set> set = new TreeSet<Set>();
		Set t1 = new Set(1, "Priya");
		Set t2 = new Set(2, "Deepti");
		set.add(t1);
		set.add(t2);
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}

	}

	public static void employeedelete() {
		TreeSet<Set> set = new TreeSet<Set>();
		Set t1 = new Set(1, "Priya");
		Set t2 = new Set(2, "Deepti");
		set.add(t1);
		set.add(t2);
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}
		set.remove(t1);
		System.out.println("After deletion:");
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}

	}

	public static void employeeupdate() {
		TreeSet<Set> set = new TreeSet<Set>();
		Set set1 = new Set(1, "Priya");
		Set set2 = new Set(2, "Deepti");
		set.add(set1);
		set.add(set2);
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}
		Set set3 = new Set(3, "Pooja");
		set.add(set3);
		System.out.println("After update:");
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}

	}

}
