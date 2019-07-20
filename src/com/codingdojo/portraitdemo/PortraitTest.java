package com.codingdojo.portraitdemo;

public class PortraitTest {

	public static void main(String[] args) {
	
		
		System.out.println("----------------User 1: Lauren's Info---------------------");
		// Instantiation of the first user's portrait
		Portrait p1 = new Portrait("Lauren");
				
		// add a single shape to the myShapes user array
		p1.addShape(new Circle(25));
		p1.addShape(new Square(5));
		
		//////////////////////////////////////////////////////////////////////
		// add multiple shapes to the users shape GROUP
		Shape[] laurensshapes = {
				new Circle(10),
				new Square(3),
				};
		
		// add the shapes GROUP to the users myShape Array
		p1.addShape(laurensshapes);
		//////////////////////////////////////////////////////////////////////
		
		// display all the shapes that have been added to the users portrait		
		p1.getMyShapes();
		System.out.println("Lauren's total shape area for her portrait is: " + p1.getMyArea(p1));
		System.out.println("Lauren's total shape perimeter for her portrait is: " + p1.getMyPerimeter(p1));
		System.out.println("");					
		
		
		System.out.println("----------------User 2: Ricky's Info---------------------");
		// Instantiation of the first user's portrait
		Portrait p2 = new Portrait("Ricky");
				
		// add a single shape to the myShapes user array
		p2.addShape(new Rectangle(2,10));
		
		//////////////////////////////////////////////////////////////////////
		// add multiple shapes to the users shape GROUP
		Shape[] rickysshapes = {
				new Circle(10),
				new Square(5),
				new Triangle(10,10,10)
				};
		
		// add the shapes GROUP to the users myShape Array
		p2.addShape(rickysshapes);
		//////////////////////////////////////////////////////////////////////
				
		// display all the shapes that have been added to the users portrait		
		p2.getMyShapes();
		System.out.println("Ricky's total shape area for his portrait is: " + p2.getMyArea(p2));
		System.out.println("Ricky's total shape perimeter for his portrait is: " + p2.getMyPerimeter(p2));
		System.out.println("");	
		
		
		System.out.println("----------------User 3: Zen's Info---------------------");
		// Instantiation of the first user's portrait
		Portrait p3 = new Portrait("Zen");
				
		// add a single shape to the myShapes user array
		p3.addShape(new Triangle(7,7,7));
		p3.addShape(new Triangle(5,5,5));
						
		// display all the shapes that have been added to the users portrait		
		p3.getMyShapes();
		System.out.println("Zen's total shape area for his portrait is: " + p3.getMyArea(p3));
		System.out.println("Zen's total shape perimeter for his portrait is: " + p3.getMyPerimeter(p3));
		System.out.println("");	
		
		
		System.out.println("----------------User 4: Rob's Info---------------------");
		// Instantiation of the first user's portrait
		Portrait p4 = new Portrait("Robert");
				
		// add a single shape to the myShapes user array
		p4.addShape(new Hexagon(5));
		p4.addShape(new Triangle(5,5,5));
						
		// display all the shapes that have been added to the users portrait		
		p4.getMyShapes();
		System.out.println("Robert's total shape area for his portrait is: " + p4.getMyArea(p4));
		System.out.println("Robert's total shape perimeter for his portrait is: " + p4.getMyPerimeter(p4));
		System.out.println("");	
		
		
		System.out.println("----------------Total area of all shapes---------------------");
		
		//System.out.println(Portrait.getAllShapes());
		//Portrait.printOverallArea();
		//System.out.println("Overall area of all shapes is: " + Portrait.getMyArea(Portrait));
		
		
	}
	
}
		
	
	



