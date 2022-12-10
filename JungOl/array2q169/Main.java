package array2q169;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] ar = new char[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				ar[i][j] = sc.next().charAt(0);
			}
		}
		sc.close();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%c ", ar[i][j] + 32);
			}
			System.out.println();
		}
	}
}