package inheritance1;

public class B extends A { // 부모 A, 자식 B, 클래스이름 extends 부모클래스  "A<-B" 
	int fieldB = 3;

	void methodB() {
		System.out.println(fieldB);
	}
}