package com.codingdojo.portraitdemo;

public interface PortraitInt {

	// Add single shapes to the portrait
	public void addShape(Shape shape);

	// Add multple shapes to the portrait at once
	public void addShape(Shape[] shapes);
	
	// Get total area overall (all portraits)
	public double getAreaOverall(Shape[] shapes);
	
	// Method to get total area of all shapes per user portrait
	public String getMyArea(Portrait portrait);
	
}
