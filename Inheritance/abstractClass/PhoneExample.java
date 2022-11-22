package abstractClass;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new SmartPhone("홍길동"); <- 추상클래스는 인스턴스 선언 ㄴㄴ

		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn(); // 부모클래스(추상클래스) 메서드 호출
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}