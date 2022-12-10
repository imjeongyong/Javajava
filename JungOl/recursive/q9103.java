package recursive;

import java.util.Scanner;

public class q9103 {

	public int factorial(int N) {
		if (N == 1) {
			return 1;
		} else {
			int res = N * factorial(N - 1);
			return res;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		q9103 m = new q9103();
		System.out.println(m.factorial(N));
	}
}