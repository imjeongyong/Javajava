package string2Q9128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

		String str3 = sc.next();
		String str4 = sc.next();
		sc.close();

		double n3 = Double.parseDouble(str3);
		double n4 = Double.parseDouble(str4);
		System.out.printf("%.2f + %.2f = %.2f", n3, n4, (n3 + n4));
	}
}