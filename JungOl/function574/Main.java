package function574;

import java.util.Scanner;

public class Main {

	public int findMax(int a, int b, int c) {
		int[] ar = { a, b, c };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (max <= ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		Main main = new Main();
		int max1 = main.findMax(n1, n2, n3);
		System.out.println(max1);
	}
}