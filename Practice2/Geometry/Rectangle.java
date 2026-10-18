public class Rectangle extends Shape {
	private double width;
	private double height;

	Rectangle (double w, double h) {
		width = w;
		height = h;
	}
	@Override public double getArea() {
		return width * height;
	}
	@Override public double getPerimeter() {
		return 2.0 * (width + height);
	}
	@Override public String toString() {
		return "Прямоугольник со сторонами " + width + " и " + height;
	}
}
