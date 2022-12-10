package function174;

import java.util.Scanner;

public class Main {

	void sumPrint(int[][] ar) {
		int[] sumAr = new int[3];
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				System.out.print(ar[i][j] + " ");
				sum += ar[i][j];
			}
			sumAr[i] = sum;
			System.out.println(sumAr[i]);
		}
		for (int j = 0; j < 3; j++) {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += ar[i][j];
			}
			System.out.print(sum + " ");
		}

		int sumsum = 0;
		for (int i = 0; i < 3; i++) {
			sumsum += sumAr[i];
		}
		System.out.print(sumsum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] scoAr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				scoAr[i][j] = sc.nextInt();
			}
		}
		sc.close();

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(scoAr[i][j] + " ");
//			}
//			System.out.println();
//		}

		Main m = new Main();
		m.sumPrint(scoAr);
	}
}