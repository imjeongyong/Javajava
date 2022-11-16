package q614;

import java.util.Scanner;

class MemberV {
	private String schoolName;
	private int grade;

	public MemberV(String schoolName, int grade) {
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		MemberV mem1 = new MemberV("Jejuelementary", 6);
		mem1.print();

		Scanner sc = new Scanner(System.in);
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		MemberV mem2 = new MemberV(schoolName, grade);
		mem2.print();
	}
}
