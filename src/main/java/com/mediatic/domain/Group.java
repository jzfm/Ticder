package com.mediatic.domain;

import java.util.List;
import java.util.Random;

public class Group {

	private List<Student> studentList;

	public Group(){}

	public Group(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
}
