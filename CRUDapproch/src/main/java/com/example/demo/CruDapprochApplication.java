package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.domain.PostRepository")
@EntityScan("com.example.domain.PostRepository")
public class CruDapprochApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruDapprochApplication.class, args);
	}

}

