package recursive;

import java.util.Scanner;

public class q9102 {

	static void print(int N) {
		if (N == 0) {
			return;
		} else {
			print(N - 1);
			System.out.print(N + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		print(N);
	}
}