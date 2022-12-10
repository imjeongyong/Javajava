package function575;

import java.util.Scanner;

public class Main {
	public int expon(int a, int b) {
		int res = 1;
		for (int i = 0; i < b; i++) {
			res = res * a;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Main main = new Main();
		int result = main.expon(n1, n2);
		System.out.println(result);
	}
}
