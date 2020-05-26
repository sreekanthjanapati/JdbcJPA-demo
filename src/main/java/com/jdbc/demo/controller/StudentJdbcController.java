package com.jdbc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.demo.entity.StudentJdbc;
import com.jdbc.demo.service.StudentJdbcService;

@RestController
@RequestMapping("/jdbc")
public class StudentJdbcController {

	@Autowired
	private StudentJdbcService sService;

	@GetMapping("/emp/{eid}")
	public ResponseEntity<StudentJdbc> getStudentInfo(@PathVariable Integer eid) {

		StudentJdbc students = sService.getStudents(eid);

		return ResponseEntity.ok(students);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<StudentJdbc>> getStudentsInfo() {

		List<StudentJdbc> students = sService.getStudents();

		return ResponseEntity.ok(students);
	}

}
