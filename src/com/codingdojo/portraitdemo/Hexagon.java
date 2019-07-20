package com.codingdojo.portraitdemo;

public class Hexagon implements Shape {
	
	// Hexagon sub-class attributes
	protected double side;
	
	// a constructor class to set the instance's sides on creation
	public Hexagon(double side) {
		this.side = side;
	}
	
	
	@Override public double getPerimeter() {
		return (side * 6);
	}
	
	@Override public double getArea() {
		return (((3*(Math.sqrt(3))/2))*(side*side));
	}
	
	// converts the full object name to simple string name (used to get the list of shapes in the myShapes array)
	public String toString() {
	    return "hexagon";
	}
	
	
}
