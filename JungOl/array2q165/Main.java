package array2q165;

public class Main {
	public static void main(String[] args) {
		int[][] ar = new int[5][5];

		for (int i = 0; i < 5; i += 2) {
			ar[0][i] = 1;
		}

		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (j == 0) {
					ar[i][j] = ar[i - 1][j + 1];
				} else if (j == 4) {
					ar[i][j] = ar[i - 1][j - 1];
				} else {
					ar[i][j] = ar[i - 1][j - 1] + ar[i - 1][j + 1];
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}