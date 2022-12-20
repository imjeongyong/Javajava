package string1Q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		for (int i = 0; i < inp.length(); i++) {
			for (int j = 0, k = inp.length() - 1 - i; j < inp.length(); j++, k++) {
				if (k == inp.length()) {
					k = 0;
				}
				System.out.print(inp.charAt(k));
			}
			System.out.println();
		}
	}
}