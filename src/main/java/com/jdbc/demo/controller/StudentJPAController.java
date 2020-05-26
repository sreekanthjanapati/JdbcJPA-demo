package com.jdbc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.demo.entity.StudentJPA;
import com.jdbc.demo.service.StudentJPAService;

@RestController
@RequestMapping("/jpa")
public class StudentJPAController {

	@Autowired
	private StudentJPAService sService;

	@GetMapping("/emp/{eid}")
	public ResponseEntity<StudentJPA> getStudentInfo(@PathVariable Integer eid) {

		StudentJPA students = sService.getStudents(eid);

		return ResponseEntity.ok(students);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<StudentJPA>> getStudentsInfo() {

		List<StudentJPA> students = sService.getStudents();

		return ResponseEntity.ok(students);
	}

}
