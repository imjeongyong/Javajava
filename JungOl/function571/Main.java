package function571;

import java.util.Scanner;

public class Main {
	public String output() {
		String str = "~!@#$^&*()_+|";
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Main main = new Main();
		for (int i = 0; i < n; i++) {
			System.out.println(main.output());
		}
	}
}