package jungOl;

import java.util.Scanner;

public class function571 {
	String str = "~!@#$^&*()_+|";

	void output() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		function571 main = new function571();
		for (int i = 0; i < n; i++) {
			main.output();
		}
	}
}