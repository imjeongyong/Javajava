package array2q167;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ar = new int[4][2];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		sc.close();

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}

		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				sum += ar[i][j];
			}
			System.out.print(sum / 2 + " ");
			sum = 0;
		}
		System.out.println();

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 4; i++) {
				sum += ar[i][j];
			}
			System.out.print(sum / 4 + " ");
			sum = 0;
		}
		System.out.println();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				sum += ar[i][j];
			}
		}
		System.out.println(sum / 8);
	}
}