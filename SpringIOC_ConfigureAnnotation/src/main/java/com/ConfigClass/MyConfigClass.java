package com.ConfigClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Student;

@Configuration
public class MyConfigClass {
	@Bean
	public Student StudOBJ() {
		return new Student();
		
	}

}
