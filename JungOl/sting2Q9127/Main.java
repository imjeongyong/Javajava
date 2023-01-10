package sting2Q9127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단어 5개를 입력하세요.");
		String[] strAr = new String[5];
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

		for (int i = 0; i < strAr.length; i++) {
			System.out.println(strAr[i]);
		}
	}
}