public class Circle extends Shape {
	private double radius;

	Circle (double r) {
		radius = r;
	}
	@Override public double getArea() {
		return Math.PI * radius * radius;
	}
	@Override public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}
	@Override public String toString() {
		return "Окружность с радиусом " + radius;
	}
}
