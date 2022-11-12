package jungOl;

import java.util.Scanner;

public class Repeat137 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		sc.close();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				int output = j * i;
				System.out.print(output + " ");
			}
			System.out.println();
		}
	}
}