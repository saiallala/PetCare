package com.techwaves.petcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PetCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetCareApplication.class, args);
	}

}
