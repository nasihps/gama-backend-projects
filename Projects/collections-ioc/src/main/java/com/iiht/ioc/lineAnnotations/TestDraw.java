package com.iiht.ioc.lineAnnotations;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("TestComponents");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LineConfig.class);
		
		Line l = (Line) context.getBean("newLine");
		
		logger.info(l.draw());
	}

}
