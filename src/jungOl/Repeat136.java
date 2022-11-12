package jungOl;

import java.util.Scanner;

public class Repeat136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 10; i++) {
			int n = i * inp;
			System.out.print(n + " ");
		}
	}
}