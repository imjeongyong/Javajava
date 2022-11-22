package abstractAnimal;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog 클래스 선언 -> Dog 클래스 메서드 호출
		Cat cat = new Cat(); // Cat 클래스 선언 -> Cat 클래스 메서드 호출
		dog.sound();
		cat.sound();
		System.out.println("1. ------------------------");

		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("2. --------------------------");

		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}