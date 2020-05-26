package com.jdbc.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@javax.persistence.Table(name = "student")
@Entity
@NamedQuery(name = "find_all", query = "select s from StudentJPA s")
public class StudentJPA {

	@Id
	@GeneratedValue
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

	public StudentJPA(int id, String stuname) {
		super();
		this.id = id;
		this.stuname = stuname;
	}

	public StudentJPA() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuname=" + stuname + "]";
	}

}
