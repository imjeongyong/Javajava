package structure198;

import java.util.Scanner;

class FMar {
	Scanner sc = new Scanner(System.in);
	private FM[] fm;

	FMar() {
		int height = sc.nextInt();
		double weight = sc.nextInt();
		for (int i = 0; i < fm.length; i++) {
			fm[i] = new FM(height, weight);
		}
	}

	void sonPrint() {
		System.out.printf("height : %dcm\nweight : %.1f\n", ((fm[0].getHeight() + fm[1].getHeight()) / 2),
				(fm[0].getWeight() + fm[1].getWeight()) / 2);
	}
}

class FM {
	private int height;
	private double weight;

	FM(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}

public class Main {
	public static void main(String[] args) {
		FMar fmar = new FMar();
		fmar.sonPrint();
	}
}