package com.iiht.jdbcannotconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iiht.jdbcannotconfig")
public class AutoConfig {

	@Bean("connection")
	public JDBCConnectionUtil createUtil() {
		return new JDBCConnectionUtil(
				"jdbc:mysql://" //rest done in cloud
			
				)
				
	}
	
}
