package jungOl;

import java.util.Scanner;

public class Repeat132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 1; i <= N; i++) {
			if (i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}