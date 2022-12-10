package q1146;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			int k = 0;
			k++;
			if (min > ar[i]) {
				min = ar[i];
			}
			int tmp = ar[i];
			ar[i] = ar[k];
			ar[k] = tmp;
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}