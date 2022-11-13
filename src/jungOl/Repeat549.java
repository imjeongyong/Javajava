package jungOl;

import java.util.Scanner;

public class Repeat549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		sc.close();

		for (int i = 1; i <= n; i += 2) {
			sum = sum + i;
			count = count + 1;
			if (sum >= n)
				break;
		}
		System.out.print("" + count + " " + sum);
	}
}