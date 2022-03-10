package com.example.employeeclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeClientApplication.class, args);
	}

}
