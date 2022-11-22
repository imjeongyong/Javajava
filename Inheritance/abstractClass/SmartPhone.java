package abstractClass;

public class SmartPhone extends Phone { // 추상클래스 Phone 상속
	public SmartPhone(String owner) { // 생성자 선언
		super(owner); // 부모클래스 멤버변수 연결
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}