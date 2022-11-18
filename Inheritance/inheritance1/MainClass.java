package inheritance1;

public class MainClass {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();

		B b = new B();
		b.methodA(); // B클래스를 선언했지만 A클래스를 상속받아서 methodA(); 사용 가능
		b.methodB();
	}
}