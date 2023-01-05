package q3_221227;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();

		System.out.println(str.substring(3, 7));
	}
}