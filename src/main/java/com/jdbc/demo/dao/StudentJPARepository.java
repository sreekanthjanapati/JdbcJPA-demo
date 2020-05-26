package com.jdbc.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.jdbc.demo.entity.StudentJPA;

@Repository
public class StudentJPARepository {

	@PersistenceContext
	private EntityManager emngr;

	public StudentJPA findById(int id) {
		return emngr.find(StudentJPA.class, id);
	}

	public List<StudentJPA> findAll() {
		TypedQuery<StudentJPA> createNamedQuery = emngr.createNamedQuery("find_all", StudentJPA.class);
		return createNamedQuery.getResultList();

	}
}
