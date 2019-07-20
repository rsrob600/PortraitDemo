package com.codingdojo.portraitdemo;

public class Triangle implements Shape {

	// Triangle sub-class attributes
	protected double side1, side2, side3; 
	
	// a constructor class to set the instance's sides on creation
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	@Override public double getPerimeter(){
		return side1+side2+side3;
		} 
	
	@Override public double getArea(){
		double s = 0.5*(side1 + side2 + side3);
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		}
	
	// converts the full object name to simple string name (used to get the list of shapes in the myShapes array)
	public String toString() {
	    return "triangle";
	}
	
	
}
