package com.iiht.day2;

public class Rhombus implements Shape {

	private double diagonal1;
	private double diagonal2;
	
	public Rhombus() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Rhombus(double diagonal1, double diagonal2) {
		super();
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}



	public double getDiagonal1() {
		return diagonal1;
	}



	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}



	public double getDiagonal2() {
		return diagonal2;
	}



	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.diagonal1 * this.diagonal2)/2;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}



	@Override
	public String toString() {
		return "Rhombus [diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 + "]";
	}
	
	

}
