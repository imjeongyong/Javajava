package string1Q183;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		for (int i = 0; i < 5; i++) {
			System.out.print(str.charAt(i));
		}
	}
}