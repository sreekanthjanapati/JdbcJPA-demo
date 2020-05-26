package com.jdbc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.demo.dao.StudentJPARepository;
import com.jdbc.demo.dao.StudentJdbcRepository;
import com.jdbc.demo.entity.StudentJPA;
import com.jdbc.demo.entity.StudentJdbc;

@Service
public class StudentJPAService {

	
	@Autowired
	private StudentJPARepository sRepository;
	
	public StudentJPA getStudents(Integer emid) {
		return sRepository.findById(emid);
		
	}
	
	public List<StudentJPA> getStudents() {
		return sRepository.findAll();
		
	}

}
