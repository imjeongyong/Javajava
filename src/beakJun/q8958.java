/*
package beakJun;

import java.util.Scanner;

public class q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int sum = 0;
			int get = 1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					sum += get++;
				} else {
					get = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
*/

package beakJun;

import java.util.Scanner;

public class q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int column = sc.nextInt();
		int[][] ar = new int[column][];
		for (int i = 0; i < column; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				ar[i][j]= 
			}
		}

	}
}