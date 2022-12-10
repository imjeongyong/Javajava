package recursive;

import java.util.Scanner;

public class q9104 {

	static int digitSum(int N) {
		if (N / 10 == 0) {
			return N;
		} else {
			int res = (N % 10) + digitSum(N / 10);
			return res;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.print(digitSum(N));
	}
}