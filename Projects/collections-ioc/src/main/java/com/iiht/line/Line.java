package com.iiht.line;

public class Line {
	private Point p1;
	private Point p2;
	
	public Line() {
		// TODO Auto-generated constructor stub
	}

	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public String drawLine() {
		return "Line's x1,y1 = " + this.p1 + " AND x2,y2 = " + this.p2;
	}
	
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
		
	}
	
	
	
}
