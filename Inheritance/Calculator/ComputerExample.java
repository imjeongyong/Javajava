package Calculator;

public class ComputerExample {
	public static void main(String[] args) { // 메소드 오버라이드
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r)); // 메소드 호출명, 파라메터값이 같지만 상속된 클래스에서 재정의
	}
}