package jungOl;

import java.util.Scanner;

public class Repeat134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int even = 0;
		int odd = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}