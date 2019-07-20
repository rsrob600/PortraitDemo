package com.codingdojo.portraitdemo;
import java.util.ArrayList;

// Concrete Class
public class Portrait implements PortraitInt{
	
	// Portrait Object name variables/attributes.
	private String name = null;
	
	// a constructor class to set the instance's name on creation
	public Portrait(String name) {
		setName(name);
	}
	
	
	// --------------------------------------Portrait Names Getters and Setters----------------------------------------------->>
	// Portrait Name setter
	public void setName(String name) {
		this.name = name;
	}
	
	// Portrait Name getter
	public String getName() {
		return name;
	}
	
	
	// --------------------------------------Shapes ArrayList and Add Methods----------------------------------------------->>
	// Portrait Array Object to hold shape objects (creates a new canvas each time Portrait is instantiated)
	ArrayList<Shape> myShapes = new ArrayList<Shape>();
	
	// Overloaded method to add a single new shape to the myShapes portrait array
	@Override public void addShape(Shape shape) {
		this.myShapes.add(shape);
	}
	
	// Overloaded method to add new shape GROUP to the myShapes portrait array
	@Override public void addShape(Shape[] shapes) {
		for (Shape s : shapes) {
			this.myShapes.add(s);
		}
	}
	
	
	// --------------------------------------Shapes List Getters and Display----------------------------------------------->>
	// Individual ArrayList Getter
	public ArrayList<Shape> getShape(){
		return myShapes;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	// Overall ArrayList Getter
	public ArrayList<Shape> getAllShapes(){
		//
		//
		//return allShapes;
		return null;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	
	// Display MyShapes
	public void getMyShapes() {
		System.out.println(getName() + "'s portrait contains the following: " + this.getShape());
	}
	
	
	// --------------------------------------Shapes Area Getters----------------------------------------------->>
	// Method to get overall area of all shapes
	@Override public double getAreaOverall(Shape[] shapes) {
		double sum = 0;
		for (Shape s : shapes) {
			sum = sum + s.getArea();
			} 
		return sum; 
		}
	
	
	// Method to get total area of all shapes per user portrait
	@Override public String getMyArea(Portrait portrait) {
		double sum = 0;
		for (Shape s : portrait.getShape()) {
			sum = sum + s.getArea();
		}
		return String.format("%.2f",sum);
	}
	
	
	// --------------------------------------Shapes Perimeter Getters----------------------------------------------->>	
	// Method to get total perimeter of all shapes per user portrait
	public String getMyPerimeter(Portrait portrait) {
		double sum = 0;
		for (Shape s : portrait.getShape()) {
			sum = sum + s.getPerimeter();
		}
		return String.format("%.2f",sum);
	}
	
	
	
}