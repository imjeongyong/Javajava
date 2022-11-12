package jungOl;

import java.util.Scanner;

public class rePeat131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[2];
		for (int i = 0; i < 2; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		if (ar[0] > ar[1]) {
			for (int i = ar[1]; i <= ar[0]; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = ar[0]; i <= ar[1]; i++) {
				System.out.print(i + " ");
			}
		}
	}
}