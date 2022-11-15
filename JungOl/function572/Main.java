package function572;

import java.util.Scanner;

public class Main {
	double pi = 3.14;

	public double circleW(double r) {
		double cw = r * r * pi;
		return cw;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();

		Main main = new Main();
		double result = main.circleW(r);
		System.out.printf("%.2f", result);
	}
}