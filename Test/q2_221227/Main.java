package q2_221227;

import java.util.Scanner;

public class Main {

	public void printG(int x1, int y1, int x2, int y2, int x3, int y3) {
		double gX = (x1 + x2 + x3) / (double) 3;
		double gY = (y1 + y2 + y3) / (double) 3;

		System.out.printf("(%.1f, %.1f)", gX, gY);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();

		Main m = new Main();
		m.printG(x1, y1, x2, y2, x3, y3);
	}
}