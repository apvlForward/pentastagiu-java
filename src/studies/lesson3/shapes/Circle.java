package studies.lesson3.shapes;

public class Circle extends Shape {

	public Circle(String name, int r) {
		this.name = name;
		perimeter = 2 * Math.PI * r;
		area = Math.PI * r * r;
	}
}