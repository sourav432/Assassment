package com.example.Assessment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.Assessment1.entity")
public class Assessment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment1Application.class, args);
	}

}
