package com.iiht.day2;

import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestShapes {
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("TestShapes");
		
		//BeanFactory factory = new FileSystemXmlApplicationContext("beans-fp.xml");
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans-cp.xml");
		factory.registerShutdownHook();
		
		//rectangle
		Shape r = (Rectangle) factory.getBean("rect");
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(r);
		logger.info(r+"");
		double rectResult = r.area();
		//System.out.println(rectResult);
		//System.out.println(r.getShape());
		//System.out.println();
		logger.info(rectResult+"");
		logger.info(r.getShape());
		logger.info("");
		
		//triangle
		Shape t = (Triangle) factory.getBean("tri");
		//System.out.println(t);
		logger.info(t+"");
		double triResult = t.area();
		//System.out.println(triResult);
		//System.out.println(t.getShape());
		//System.out.println();
		logger.info(triResult+"");
		logger.info(t.getShape());
		logger.info("");
		
		//rhombus
		Shape rh = (Rhombus) factory.getBean("rho");
		//System.out.println(rh);
		logger.info(rh+"");
		double rhoResult = rh.area();
		//System.out.println(rhoResult);
		//System.out.println(rh.getShape());
		//System.out.println();
		logger.info(rhoResult+"");
		logger.info(rh.getShape());
		logger.info("");
		
	}

}
