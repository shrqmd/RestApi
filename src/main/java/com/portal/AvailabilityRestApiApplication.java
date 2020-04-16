package com.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages ="com.portal")

public class AvailabilityRestApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(AvailabilityRestApiApplication.class, args);
		System.out.println("running...");
	}



}
