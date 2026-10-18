public class Cat extends Animal {
	
	Cat (int a, String n) {
		age = a;
		name = n;
	}
	@Override public String makeSound() {
		return " Мяу-мяу ";
	}
	@Override public String toString() {
		return name+" говорит "+ makeSound();
	}
}
