package jungOl;

import java.util.Scanner;

public class Repeat138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
	}
}