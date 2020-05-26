package com.jdbc.demo.entity;

public class StudentJdbc {

	private int id;
	private String stuname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public StudentJdbc(int id, String stuname) {
		super();
		this.id = id;
		this.stuname = stuname;
	}

	public StudentJdbc() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuname=" + stuname + "]";
	}

}
