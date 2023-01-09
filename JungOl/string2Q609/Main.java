package string2Q609;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strAr = new String[3];
		for (int i = 0; i < strAr.length; i++) {
			strAr[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < strAr.length; i++) {
			for (int j = 0; j < strAr.length - 1; j++) {
				if (strAr[j].compareTo(strAr[j + 1]) > 0) {
					String tmp = strAr[j];
					strAr[j] = strAr[j + 1];
					strAr[j + 1] = tmp;
				}
			}
		}

		System.out.println(strAr[0]);
	}
}