package com.mediatic.domain;

import com.mediatic.util.InvalidParamException;

public class Student {

	private Integer idStudent;
	private String name;
	private Boolean grouped;
	private static int COUNT = 1;
	
	public Student(String name) throws InvalidParamException {
		if (name.equals(""))
			throw new InvalidParamException();
		this.name = name;
		this.grouped = false;
		this.idStudent = COUNT;
		COUNT++;
	}
	public Integer getIdStudent() {
		return idStudent;
	}

	public String getName() {
		return name;
	}

	public Boolean getGrouped() {
		return grouped;
	}

	public void setGrouped(boolean grouped) { this.grouped = grouped; }
}
