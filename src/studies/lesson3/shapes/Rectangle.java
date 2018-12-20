package studies.lesson3.shapes;

public class Rectangle extends Shape{

	public Rectangle(String name, int a, int b) {
		this.name = name;
		perimeter = 2*a + 2*b;
		area = a*b;
	}
}