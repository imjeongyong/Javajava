package jungOl;

import java.util.Scanner;

public class Repeat550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 1; i <= N; i++) {
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= N; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}