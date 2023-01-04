package string2Q9123;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strAr = new String[2];
		for (int i = 0; i < 2; i++) {
			strAr[i] = sc.next();
		}
		sc.close();

		String str = strAr[1].concat(strAr[0]);
		System.out.println(str);
	}
}