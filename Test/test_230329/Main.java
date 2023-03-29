package test_230329;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Point[] point = new Point[3]; // 3개짜리 좌표 배열 생성 및 초기화
		for (int i = 0; i < 3; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();

			point[i] = new Point(x, y);
		}
		sc.close();

		Triangle triangle = new Triangle(point[0], point[1], point[2]); // 삼각형 객체 생성
		print(triangle.findGPoint()); // 무게중심 구한 후 출력
	}

	public static void print(Point p) { // 좌표 출력
		System.out.printf("(%.1f, %.1f)\n", p.getX(), p.getY());
	}
}

class Point { // 좌표를 저장하는 객체
	private double x, y;

	Point(double x, double y) { // 생성자로 객체 저장
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

class Triangle { // 좌표저장한 객체 3개를 받아 삼각형 좌표 객체
	private static Point p1, p2, p3;

	public Triangle(Point p1, Point p2, Point p3) { // 생성자로 삼각형 좌표 저장
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point findGPoint() { // 무게중심을 구한 후 좌표 객체로 반환
		Point gP = null;
		double gX = (p1.getX() + p2.getX() + p3.getX()) / 3;
		double gY = (p1.getY() + p2.getY() + p3.getY()) / 3;
		gP = new Point(gX, gY);

		return gP;
	}
}