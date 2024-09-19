package com.iiht.ioc.lineAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iiht.ioc.lineAnnotations")

public class LineConfig {
	@Bean(name="p1")
	public Point createPoint1() {
		return new Point(12.5, 19.5);
	}
	
	@Bean(name="p2")
	public Point createPoint2() {
		return new Point(20.5, 18.7);
	}
	
	
	
}
