package cheese;

import java.util.Scanner;

public class q1840 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int column = sc.nextInt();
		int row = sc.nextInt();

		int[][] cheese = new int[column][row];
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				cheese[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(cheese[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------");
	}
}