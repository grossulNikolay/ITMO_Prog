abstract public class Animal {
	int age;
	String name;

	public void printDescription() {
		System.out.println(toString());
	}
	abstract String makeSound();
}
