public class Dog extends Animal {
	
	Dog (int a, String n) {
		age = a;
		name = n;
	}
	@Override public String makeSound() {
		return " Гав-гав ";
	}
	@Override public String toString() {
		return name+" говорит "+ makeSound();
	}
}
