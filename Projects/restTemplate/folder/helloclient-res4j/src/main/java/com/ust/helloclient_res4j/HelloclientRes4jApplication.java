package com.ust.helloclient_res4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloclientRes4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloclientRes4jApplication.class, args);
	}

	@Bean
	public RestTemplate newTemplate(){
		return new RestTemplate();
	}

}
