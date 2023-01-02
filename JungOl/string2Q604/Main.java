package string2Q604;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] strAr = new String[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < strAr.length; i++) {
			strAr[i] = sc.next();
		}
		char c = sc.next().charAt(0);
		sc.close();
		for (int i = 0; i < strAr.length; i++) {
			if (strAr[i].charAt(strAr[i].length() - 1) == c) {
				System.out.println(strAr[i]);
			}
		}
	}
}