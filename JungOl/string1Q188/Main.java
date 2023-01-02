package string1Q188;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		int i = 1;
		String[] strAr = str.split(" ");
		for (String print : strAr) {
			System.out.println(i++ +". "+ print);
		}
	}
}