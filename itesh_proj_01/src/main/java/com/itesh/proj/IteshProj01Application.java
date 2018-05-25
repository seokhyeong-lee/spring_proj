package com.itesh.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.itesh.proj")
public class IteshProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(IteshProj01Application.class, args);
	}
	
}
