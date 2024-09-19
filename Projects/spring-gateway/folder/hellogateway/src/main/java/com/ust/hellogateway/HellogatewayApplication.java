package com.ust.hellogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class HellogatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(HellogatewayApplication.class, args);
	}

}
