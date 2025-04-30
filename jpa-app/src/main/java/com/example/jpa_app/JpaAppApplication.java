package com.example.jpa_app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main application class for the JPA Application.
 * Uses @EnableDiscoveryClient to register with Eureka Server.
 */
@SpringBootApplication
@EnableDiscoveryClient  // This replaces @EnableEurekaClient which is deprecated
public class JpaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAppApplication.class, args);
	}
}