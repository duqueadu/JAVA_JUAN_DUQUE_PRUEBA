package com.com.smm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.com.smm.infrastructure.entities", "com.com.smm.domain.model"})
public class SmmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmmApplication.class, args);
	}

}
