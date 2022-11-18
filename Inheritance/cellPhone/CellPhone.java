package cellPhone;

public class CellPhone { // 클래스 선언
	String model; // 멤버변수 선언
	String color;

	void powerOn() { // 메서드 생성
		System.out.println("Power On");
	}

	void powerOff() {
		System.out.println("Power Off");
	}

	void bell() {
		System.out.println("Bell ring");
	}

	void sendVoice(String message) {
		System.out.println("Send Message" + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("Receive Message :" + message);
	}
	
	void hangUp() {
		System.out.println("Hang Up");
	}
}