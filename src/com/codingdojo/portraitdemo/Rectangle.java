package com.codingdojo.portraitdemo;

public class Rectangle implements Shape {
	
	// Rectangle sub-class attributes
	protected double side1, side2;
	
	// a constructor class to set the instance's sides on creation
	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	
	@Override public double getPerimeter() {
		return ((side1*2)+ (side2*2));
	}
	
	@Override public double getArea() {
		return (side1*side2);
	}
	
	// converts the full object name to simple string name (used to get the list of shapes in the myShapes array)
	public String toString() {
	    return "rectangle";
	}
	
	
}
