/*
package jungOl;

import java.util.Scanner;

public class array563 { // 내림차순 정리 -> 선택 정렬!!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			int max = -1;
			int idx = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] > max) {
					max = ar[j];
					idx = j;
				}
			}
			System.out.print(max + " ");
			ar[idx] = -1;
		}
	}
}
*/

package jungOl;

import java.util.Scanner;

public class array563 { // 내림차순 정리 -> 버블 정렬!!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] < ar[j + 1]) {
					int tmp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
