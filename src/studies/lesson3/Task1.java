package studies.lesson3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import studies.lesson3.shapes.Circle;
import studies.lesson3.shapes.Rectangle;
import studies.lesson3.shapes.Shape;
import studies.lesson3.shapes.Square;
import studies.lesson3.shapes.Triangle;

public class Task1 {

	public static void main(String[] args) {

		List<Shape> listOfShapes = Arrays.asList(
				new Square("square", 4),
				new Rectangle("rectangle1", 5, 3),
				new Rectangle("rectangle2", 3, 4),
				new Triangle("triangle", 1, 3, 2),
				new Circle("circle", 3)
				);
		
		Shape maxAreaShape = listOfShapes.get(0);
		for (Shape shape : listOfShapes) {
			if (shape.getArea() > maxAreaShape.getArea()) {
				maxAreaShape = shape;
			}
		}
		
		System.out.println("Object with the biggest area is \"" + maxAreaShape.getName() + "\"" 
							+ "\nArea: " + maxAreaShape.getArea());
	}
}
