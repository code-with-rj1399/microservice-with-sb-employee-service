package com.microservices_with_sb.microservice_with_sb_employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceWithSbEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWithSbEmployeeServiceApplication.class, args);
	}

}
