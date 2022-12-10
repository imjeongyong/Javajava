public class RunAnimal {
	public static void main(String[] args) { // 메인 매서드
		Animal ani1 = new Animal();
//		ani1.name = "Cat"; <- Animal클래스에 멤버변수 name에 private 선언 -> 직접 사용 불가
		ani1.setName("Cat2");
		ani1.age = 10;

//		System.out.println(ani1.name);
		System.out.println(ani1.getName());
		System.out.println(ani1.age);
	}
}