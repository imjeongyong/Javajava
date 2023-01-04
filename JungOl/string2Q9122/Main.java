package string2Q9122;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strAr = new String[2];
		for (int i = 0; i < 2; i++) {
			strAr[i] = sc.next();
		}
		sc.close();

		if (strAr[0].length() > strAr[1].length()) {
			String tmp = strAr[0];
			strAr[0] = strAr[1];
			strAr[1] = tmp;
		}

		for (int i = 0; i < 2; i++) {
			System.out.println(strAr[i]);
		}
	}
}