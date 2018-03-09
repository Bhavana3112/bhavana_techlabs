package com.techlabs.student;

import java.util.List;

public interface StudentStore {
	public void init();

	public void add(Student student);

	public List<Student> get();

}
