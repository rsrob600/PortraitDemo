package com.codingdojo.portraitdemo;

public class Square implements Shape {
	
	// Square sub-class attributes
	protected double side1;
	
	// a constructor class to set the instance's sides on creation
	public Square(double side1) {
		this.side1 = side1;
	}
	
	
	@Override public double getPerimeter() {
		return (side1*4);
	}
	
	@Override public double getArea( ) {
		return (side1*side1);
	}
	
	// converts the full object name to simple string name (used to get the list of shapes in the myShapes array)
    public String toString() {
    	return "square";
    }
    
    
}
