package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("TestComponents");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		logger.info(context+"");
		logger.info(context.getBean(ATnT.class)+"");
		logger.info(context.getBean("atnt")+"");
		
		Mobile iphone14 = (Mobile) context.getBean("iphone14");
		
		iphone14.turnOn();
		
	}

}
