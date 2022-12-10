package stringQ9115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		char[] charAr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charAr[i] = str.charAt(i);
		}

		for (int i = 0; i < charAr.length; i++) {
			if (Character.isLowerCase(charAr[i])) {
				charAr[i] = (char) (charAr[i] - 32);
			} else if (Character.isUpperCase(charAr[i])) {
				charAr[i] = (char) (charAr[i] + 32);
			}
		}
		for (int i = 0; i < charAr.length; i++) {
			System.out.print(charAr[i]);
		}
	}
}