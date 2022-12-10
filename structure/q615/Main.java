package q615;

import java.util.Scanner;

class Student { // Student 클래스 선언
	private String name; // 멤버변수 생성
	private int korScore;
	private int engScore;

	public Student(String name, int korScore, int engScore) { // 생성자(멤버변수 초기화에 사용)
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}

	public void print() { // 프린트 매서드
		System.out.println(name + " " + korScore + " " + engScore);
	}

	public int getKorScore() { // 멤버변수에 private 걸어놔서 간접 사용 
		return korScore;
	}

	public int getEngScore() {
		return engScore;
	}

}

public class Main { // 메인매서드 여기서부터 시작
	public static void main(String[] args) { // static-> 인스턴스 변수 생성x, 시스템 시작과 동시에 메모리에 저장
		Scanner sc = new Scanner(System.in); // 스캐너 클래스
		Student[] stu = new Student[2]; // ****클래스 배열 선언****
		for (int i = 0; i < stu.length; i++) { // 클래스 배열에 생성자 클래스를 반복문이용하여 초기화
			String name = sc.next();
			int korScore = sc.nextInt();
			int engScore = sc.nextInt();

			stu[i] = new Student(name, korScore, engScore);
			stu[i].print(); // 프린트 매서드
		}
		sc.close();

		int sumKor = 0, sumEng = 0; // 과목당 점수 합계
		for (int i = 0; i < stu.length; i++) {
			sumKor += stu[i].getKorScore();
			sumEng += stu[i].getEngScore();
		}
		System.out.println("avg " + sumKor / stu.length + " " + sumEng / stu.length); // 평균 출력
	}
}