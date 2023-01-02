package string2Q9118;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ar = new String[5];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next();
			System.out.println(ar[i]);
		}
		sc.close();
	}
}