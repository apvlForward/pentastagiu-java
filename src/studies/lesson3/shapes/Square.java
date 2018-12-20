package studies.lesson3.shapes;

public class Square extends Shape{

	public Square(String name, int a) {
		this.name = name;
		perimeter = 4*a;
		area = a*a;
	}
}