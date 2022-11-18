package cellPhone;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		// 클래스 생성하기 위한 참조변수 선언 = <- 생성된 인스턴스의 주소를 저장 new<- heap영역에 인스턴스 생성

		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);

		System.out.println("channel : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn(); // 부모 클라스인 CellPhone클라스의 메서드
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요. 홍길동 입니다.");
		dmbCellPhone.sendVoice("네, 반갑습니다");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb(); // 자식 클라스인 DmbCellPhone의 메서드
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}