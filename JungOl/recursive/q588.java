package recursive;

import java.util.Scanner;

public class q588 {

	static void print(int N) {
		if (N == 0) {
			return;
		} else {
			System.out.print(N + " ");
			print(N - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		print(N);
	}
}