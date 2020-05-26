package com.jdbc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.demo.dao.StudentJdbcRepository;
import com.jdbc.demo.entity.StudentJdbc;

@Service
public class StudentJdbcService {

	
	@Autowired
	private StudentJdbcRepository sRepository;
	
	public StudentJdbc getStudents(Integer emid) {
		return sRepository.findById(emid);
		
	}
	
	public List<StudentJdbc> getStudents() {
		return sRepository.findAll();
		
	}

}
