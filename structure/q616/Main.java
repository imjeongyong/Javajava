package q616;

import java.util.Scanner;

class Triangle {
	private int x;
	private int y;

	Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle[] tri = new Triangle[3];
		for (int i = 0; i < tri.length; i++) { // Triangle 생성자 입력
			int x = sc.nextInt();
			int y = sc.nextInt();
			tri[i] = new Triangle(x, y);
		}
		sc.close();

		int xG = 0; // 무게중심 x좌표의 합
		for (int i = 0; i < tri.length; i++) {
			xG = xG + tri[i].getX();
		}

		int yG = 0; // 무게중심 y좌표의 합ㄴ
		for (int i = 0; i < tri.length; i++) {
			yG = yG + tri[i].getY();
		}

		System.out.printf("(%.1f, %.1f)", (double) xG / 3, (double) yG / 3);
	}
}