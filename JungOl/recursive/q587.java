package recursive;

import java.util.Scanner;

public class q587 {
	static void print(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println("recursive");
			print(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		print(inp);
	}
}