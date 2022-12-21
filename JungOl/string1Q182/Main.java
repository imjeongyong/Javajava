package string1Q182;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp1 = sc.next().charAt(0);
		char inp2 = sc.next().charAt(0);
		sc.close();

		int plus = (int) inp1 + (int) inp2;
		int minus = (int) inp1 - (int) inp2;
		System.out.print(plus + " " + Math.abs(minus));
	}
}