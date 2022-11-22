package abstractAnimal;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() { // 부모클래스 메서드 sound() <- 오버라이드(재정의)
		System.out.println("야옹");
	}
}