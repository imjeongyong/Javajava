package jungOl;

import java.util.Scanner;

public class Repeat139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		if (n1 >= n2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = n1; j >= n2; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		} else if (n1 < n2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = n1; j <= n2; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		}

	}
}