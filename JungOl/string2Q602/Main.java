package string2Q602;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] strAr = new String[5];
		for (int i = 0; i < strAr.length; i++) {
			strAr[i] = sc.next();
		}
		sc.close();

		for (int i = strAr.length - 1; i >= 0; i--) {
			System.out.println(strAr[i]);
		}

	}
}