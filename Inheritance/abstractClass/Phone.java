package abstractClass;

public abstract class Phone { // 추상 클래스 선언
	public String owner; // Phone 클래스의 멤버변수

	public Phone(String owner) { // 생성자 <- Phone 클래스의 멤버변수 초기화
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}