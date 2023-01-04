package string2Q9124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strAr = new String[2];
		for (int i = 0; i < 2; i++) {
			strAr[i] = sc.next();
		}
		sc.close();
		
		String str1 = strAr[1].substring(0, 3) + strAr[0].substring(3, strAr[0].length());
		String str2 = strAr[1] + strAr[0].substring(0, 3);
		System.out.println(str1);
		System.out.println(str2);
	}
}