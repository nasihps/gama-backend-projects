package com.iiht.ioc.lineAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("newLine")
public class Line {
	
	//@Autowired
	private Point p1;

	//@Autowired
	private Point p2;
	
	@Autowired
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public String draw() {
		return "our x1,y1 is : " + p1.x +" & "+ p1.y + " and x2,y2 is : " + p2.x +" & " + p2.y ;
	}
	
}
