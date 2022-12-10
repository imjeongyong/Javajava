package recursive;

import java.util.Scanner;

public class q589 {

	static int sum(int N) {
		if (N == 1) {
			return 1;
		} else {
			int res = N + sum(N - 1);
			return res;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.println(sum(N));
	}
}