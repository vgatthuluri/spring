package com.avg.spring.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoRestApplication {

	
	public static void main(String args[]){
		System.out.println("Starting DemoRestApplication .....");
		SpringApplication.run(DemoRestApplication.class, args);
		System.out.println("Started DemoRestApplication....");
	}
}
