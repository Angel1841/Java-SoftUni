package com.softuni.jsonexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JsonExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonExerciseApplication.class, args);
	}

}
