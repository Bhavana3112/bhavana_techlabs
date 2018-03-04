package com.techlabs.set.test;

import java.util.HashSet;

import com.techlabs.set.Set;

public class SetTest {
	public static void main(String[] args) {
		employeeadd();
		employeedelete();
		employeeupdate();

	}

	public static void employeeadd() {
		HashSet<Set> set = new HashSet<Set>();
		Set set1 = new Set(1, "Priya");
		Set set2 = new Set(2, "Deepti");
		Set set3 = new Set(3, "Pooja");
		set.add(set1);
		set.add(set2);
		set.add(set3);
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}
	}

	public static void employeedelete() {
		HashSet<Set> set = new HashSet<Set>();
		Set set1 = new Set(1, "Priya");
		Set set2 = new Set(2, "Deepti");
		Set set3 = new Set(3, "Pooja");
		set.add(set1);
		set.add(set2);
		set.add(set3);
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}
		set.remove(set1);
		for (Set s : set) {
			System.out.println("After deletion:");
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}

	}

	public static void employeeupdate() {
		HashSet<Set> set = new HashSet<Set>();
		Set set1 = new Set(1, "Priya");
		Set set2 = new Set(2, "Deepti");
		Set set3 = new Set(3, "Pooja");
		set.add(set1);
		set.add(set2);
		set.add(set3);
		for (Set s : set) {
			System.out.println("employee id = " + s.getId()
					+ " employee name= " + s.getName());
		}
		Set set4 = new Set(4, "Avni");
	}
}
