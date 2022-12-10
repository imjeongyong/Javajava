package string1Q9108;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = '\0';
		do {
			c = sc.next().charAt(0);
			System.out.printf("%c -> %d\n", c, (int)c);
		} while (c != '0');
		sc.close();
	}
}