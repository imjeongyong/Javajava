package string1Q9111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "jungol olympiad";
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			System.out.print(str.charAt(n));
		}
		sc.close();
	}
}