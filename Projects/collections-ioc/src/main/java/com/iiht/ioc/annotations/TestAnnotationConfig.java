package com.iiht.ioc.annotations;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    Logger logger = Logger.getLogger("TestConfigurationConfig");
		    
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		    
		    Object obj = context.getBean(LifeCycleAnnotations.class);
		    
		    logger.info(obj.toString());
		    
		    
		    
		    
			/*
			 * AnnotationConfigApplicationContext context = new
			 * AnnotationConfigApplicationContext(JdbcConnector.class);
			 * logger.info(context.toString());
			 * 
			 * JdbcConnector connector =
			 * (JdbcConnector)context.getBean("jdbcConnector",JdbcConnector.class); boolean
			 * has = context.containsBean("jdbcConnector"); logger.info(has+"");
			 * 
			 * context.registerShutdownHook(); context.close();
			 */
	}
}