package function573;

import java.util.Scanner;

public class Main {
	public void num4(int n) {
		int[] ar = new int[n * n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			if (i % n == (n - 1)) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Main main = new Main();
		main.num4(n);
	}
}