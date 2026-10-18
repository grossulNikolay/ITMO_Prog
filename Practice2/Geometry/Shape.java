abstract public class Shape {
	public void printDescription() {
		System.out.println(toString());
		System.out.println("Площадь: " + getArea());
		System.out.println("Периметр: " + getPerimeter());
	}
	abstract double getArea();
	abstract double getPerimeter();
}
