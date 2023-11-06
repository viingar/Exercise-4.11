package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EvoProjectApplication {

	@Autowired Calculator calculator;


	public static void main(String[] args) {
		SpringApplication.run(EvoProjectApplication.class, args);
	}

	@Bean
	public void outToConsole () {
		System.out.print("Result: ");
		calculator.calc(2,3);
	}
}
