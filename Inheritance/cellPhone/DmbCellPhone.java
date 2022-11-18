package cellPhone;

public class DmbCellPhone extends CellPhone { // CellPhone 클래스 상속
	int channel; // 멤버변수
	
	DmbCellPhone(String model, String color, int channel){ // 생성자
		this.model = model; // this.model<-부모클래스의 멤버변수, 뒤에모델은 스트링타입 지역변수
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() { // 메서드 (void)<- 리턴값이 없다
		System.out.println("channel " + channel + "번 DMB 방송 수신 시작");
	}
	
	void changeChannelDmb(int channel) { // int channel<-파라메터
		this.channel = channel;
		System.out.println("Channel " + channel + "번으로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 종료");
	}
}