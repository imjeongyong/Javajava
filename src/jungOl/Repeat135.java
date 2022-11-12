package jungOl;

import java.util.Scanner;

public class Repeat135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		sc.close();

		if (n2 >= n1) {
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum = sum + i;
					count = count + 1;
				}
			}
			avg = (double) sum / count;
		} else {
			for (int i = n2; i <= n1; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum = sum + i;
					count = count + 1;
				}
			}
			avg = (double) sum / count;
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", avg);
	}
}