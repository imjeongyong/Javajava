package package2;

public class C { // 다른패키지의 클래스가 protected 여서 에러
	A1 a = new A1();
	a.field = "Value";
	a.method();
}
