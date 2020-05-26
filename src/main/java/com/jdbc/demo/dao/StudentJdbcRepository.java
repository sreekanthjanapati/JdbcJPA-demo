package com.jdbc.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.jdbc.demo.entity.StudentJdbc;

@Repository
public class StudentJdbcRepository {

	@Autowired
	private JdbcTemplate template;

	public StudentJdbc findById(int id) {
		return template.queryForObject("select * from student where id=?", new Object[] { id },
				new BeanPropertyRowMapper<StudentJdbc>(StudentJdbc.class));
	}

	class PersonRowMapper implements RowMapper<StudentJdbc> {
		@Override
		public StudentJdbc mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudentJdbc student = new StudentJdbc();
			student.setId(rs.getInt("id"));
			student.setStuname(rs.getString("stuname"));

			return student;
		}

	}

	public List<StudentJdbc> findAll() {
		return template.query("select * from student", new PersonRowMapper());
	}

}
