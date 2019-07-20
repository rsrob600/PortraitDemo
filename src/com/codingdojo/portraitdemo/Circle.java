package com.codingdojo.portraitdemo;

public class Circle implements Shape{

	// Circle sub-class attributes
	protected double radius;
	
	// a constructor class to set the instance's radius on creation
	public Circle(double radius) {
		this.radius = radius;
		} 
	
	
	@Override public double getArea() {
		return(Math.PI * radius * radius);
		}
	
	@Override
	public double getPerimeter() {
		return(Math.PI * radius * 2);
	}
	
	// converts the full object name to simple string name (used to get the list of shapes in the myShapes array)
	public String toString() {
	    return "circle";
	}
	
	
}
