package structure197;

import java.util.Scanner;

class inputCoord {
	Scanner sc = new Scanner(System.in);
	coord[] co;

	inputCoord() {
		co = new coord[2];
		for (int i = 0; i < co.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			co[i] = new coord(x, y, x1, y1);
		}
	}

	void makeRect() {
		if (co[0].getX() < co[1].getX()) {
			System.out.print(co[0].getX() + " ");
		} else {
			System.out.print(co[1].getX() + " ");
		}
		if (co[0].getY() < co[1].getY()) {
			System.out.print(co[0].getY() + " ");
		} else {
			System.out.print(co[1].getY() + " ");
		}
		if (co[0].getX1() < co[1].getX1()) {
			System.out.print(co[1].getX1() + " ");
		} else {
			System.out.print(co[0].getX1() + " ");
		}
		if (co[0].getY1() < co[1].getY1()) {
			System.out.print(co[1].getY1() + " ");
		} else {
			System.out.print(co[0].getY1() + " ");
		}

	}

}

class coord {
	private int x;
	private int y;
	private int x1;
	private int y1;

	coord(int x, int y, int x1, int y1) {
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}
}

public class Main {
	public static void main(String[] args) {
		inputCoord ic = new inputCoord();
		ic.makeRect();
	}
}