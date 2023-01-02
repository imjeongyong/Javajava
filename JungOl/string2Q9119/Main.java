package string2Q9119;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String[] strAr = str.split(" ");
		for (int i = 0; i < strAr.length; i += 2) {
			System.out.println(strAr[i]);
		}
	}
}