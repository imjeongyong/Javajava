package string1Q184;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		for (int i = 0; i < str.length(); i++) {
			char[] ar = new char[str.length()];
			ar[i] = str.charAt(i);
			if (((int) ar[i] >= 48 && (int) ar[i] <= 57) || ((int) ar[i] >= 97 && (int) ar[i] <= 122)) {
				System.out.print(ar[i]);
			} else if ((int) ar[i] >= 65 && (int) ar[i] <= 90) {
				System.out.printf("%c", ar[i] + 32);
			}
		}
	}
}