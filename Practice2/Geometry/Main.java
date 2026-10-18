public class Main {

	public static void main(String[] args) {
		Shape[] shapes = {
			new Rectangle(3.0, 2.0),
			new Triangle(3.0, 4.0, 5.0),
			new Circle(10.0),
			new Triangle(3.5, 3.5, 5.0),
			new Rectangle(2.5, 5.6),
			new Circle(3.0),
			new Rectangle(5.0, 1.0),
			new Triangle(3.5, 4.5, 5.5)
		};

		for (Shape s : shapes) {
			s.printDescription();
		}
	}
}
