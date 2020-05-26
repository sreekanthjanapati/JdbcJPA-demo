package com.jdbc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDemoApplication {

//	@Autowired
//	private StudentRepository edao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		Student student = edao.findById(2);
//
//		System.out.println("student values:: " + student);
//	}

}
