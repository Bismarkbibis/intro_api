package org.BisDev.intro_api;

import org.BisDev.intro_api.model.Category;
import org.BisDev.intro_api.model.Theater;
import org.BisDev.intro_api.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntroApi02Application {

	public static void main(String[] args) {
		SpringApplication.run(IntroApi02Application.class, args);
	}
	@Bean
	CommandLineRunner run() {
		return args -> {



		};
	}


}
