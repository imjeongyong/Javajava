package q1_221227;

import java.util.Scanner;

public class Main {

	public void numSquare(int N) {
		int num = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		Main m = new Main();
		m.numSquare(N);
	}
}