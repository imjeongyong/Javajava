package car;

public class SportCar extends Car {
	public void speedUp() {
		speed += 10;
	}

	public void stop() { // 부모 클래스인 Car 클래스의 stop()매서드가 fanal이라 오버라이드 불가 에러뜸!
		System.out.println("SporCar를 멈춤");
		speed = 0;
	}
}