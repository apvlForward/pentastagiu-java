package studies.lesson3.shapes;

public class Triangle extends Shape {
	
	public Triangle(String name, int a, int b, int c) {
		this.name = name;
		perimeter = a + b + c;
		double halfPerimeter = perimeter / 2;
		area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
	}
}