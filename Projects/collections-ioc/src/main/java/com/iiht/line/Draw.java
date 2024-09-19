package com.iiht.line;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("Draw");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-line.xml");
		Line l = (Line) context.getBean("newLine");
		logger.info(l.drawLine());
		

	}

}
