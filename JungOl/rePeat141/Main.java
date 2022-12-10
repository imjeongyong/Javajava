package rePeat141;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		int i = 1;
		int num = 0;

		while (true) {
			num = i * inp;
			if (num > 100) {
				break;
			}
			System.out.print(num + " ");
			if (num % 10 == 0) {
				break;
			}
			i++;
		}
	}
}