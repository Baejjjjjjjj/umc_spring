package com.example.app_umc_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AppUmcSpringApplication {

	public static void main(String[] args) {


		SpringApplication.run(AppUmcSpringApplication.class, args);




	}

}
