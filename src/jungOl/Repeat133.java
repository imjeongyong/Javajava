package jungOl;

import java.util.Scanner;

public class Repeat133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}

		System.out.printf("%.2f", sum / ar.length);
	}
}