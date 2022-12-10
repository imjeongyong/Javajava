package jungOl;

import java.util.Scanner;

public class Repeat553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 1; i <= N; i++) {
			sum = sum + i;
		}

		for (int i = 1; i <= sum; i++) {
			System.out.printf("%c", i + 64);

			if (i == N ) {
				System.out.println();
			}

		}
	}
}
