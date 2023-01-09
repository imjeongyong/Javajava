package string2Q9126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();

		if (str1.compareTo(str2) > 0) {
			System.out.println(str1 + " 가(이) 더 큽니다.");
		} else {
			System.out.println(str2 + " 가(이) 더 큽니다.");
		}

		if (str1.substring(0, 3).equals(str2.substring(0, 3))) {
			System.out.println("앞의 세 문자가 같습니다.");
		} else {
			System.out.println("앞의 세 문자가 같지 않습니다.");
		}
	}
}