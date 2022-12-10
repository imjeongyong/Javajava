package stringQ9114;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char c = sc.next().charAt(0);

			if ((int) c >= 97 && (int) c <= 133) {
				System.out.println("소문자입니다.");
			} else if ((int) c >= 65 && (int) c <= 91) {
				System.out.println("대문자입니다.");
			} else if (Character.isDigit(c)) {
				System.out.println("숫자문자입니다.");
			} else {
				System.out.println("영문, 숫자 이외의 문자입니다.");
				sc.close();
				break;
			}
		}
	}
}