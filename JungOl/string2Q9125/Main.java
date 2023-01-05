package string2Q9125;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] strAr = { "champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book",
				"lion" };

		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요. ");
		char c = sc.next().charAt(0);

		int counter = 0;
		for (int i = 0; i < strAr.length; i++) {
			if (strAr[i].contains(c + "")) {
				System.out.println(strAr[i]);
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("찾는 단어가 없습니다.");
		}

		System.out.println();
		System.out.print("문자열을 입력하세요. ");
		String str = sc.next();

		counter = 0;
		for (int i = 0; i < strAr.length; i++) {
			if (strAr[i].contains(str)) {
				System.out.println(strAr[i]);
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("찾는 단어가 없습니다.");
		}
		sc.close();
	}
}