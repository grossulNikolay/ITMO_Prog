public class Main {
	public static void main(String[] args) {

		Animal[] animals = {
			new Dog(5, "Шарик"),
			new Cat(2, "Рыжик"),
			new Dog(10, "Рекс"),
			new Cat(7, "Пушок")
		};

		for (Animal a : animals) {
			a.printDescription();
		}
		System.out.println(animals.length);
	}
}
