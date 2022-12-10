package instanceof1;

public class InstanceofExample { // Parent1 <- Child1
	public static void method1(Parent1 parent) {
		if (parent instanceof Child1) {
			Child1 child = (Child1) parent;
			System.out.println("method1 - Child1로 변환 성공");
		} else {
			System.out.println("method1 - Child1로 변환 실패");
		}
	}

	public static void method2(Parent1 parent) {
		Child1 child = (Child1) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent1 parentA = new Child1();
		method1(parentA);
		method2(parentA);

		Parent1 parentB = new Parent1();
		method1(parentB);
		method2(parentB);
	}
}
