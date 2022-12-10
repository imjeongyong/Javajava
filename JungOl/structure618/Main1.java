package structure618;

import java.util.Scanner;

class NHWAr {
	Scanner sc = new Scanner(System.in);
	private NHW[] nhwar;

	NHWAr() {
		nhwar = new NHW[5];
		for (int i = 0; i < nhwar.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			nhwar[i] = new NHW(name, height, weight);
		}
	}

	void nameSort() {
		for (int i = 0; i < nhwar.length; i++) {
			for (int j = 0; j < nhwar.length - 1; j++) {
				if ((int) nhwar[j].getName().charAt(0) > (int) nhwar[j + 1].getName().charAt(0)) {
					NHW tmp = nhwar[j];
					nhwar[j] = nhwar[j + 1];
					nhwar[j + 1] = tmp;
				}
			}
		}
	}

	void weightSort() {
		for (int i = 0; i < nhwar.length; i++) {
			for (int j = 0; j < nhwar.length - 1; j++) {
				if (nhwar[j].getWeight() < nhwar[j + 1].getWeight()) {
					NHW tmp = nhwar[j];
					nhwar[j] = nhwar[j + 1];
					nhwar[j + 1] = tmp;
				}
			}
		}
	}

	void print() {
		for (int i = 0; i < nhwar.length; i++) {
			System.out.println(nhwar[i].getName() + " " + nhwar[i].getHeight() + " " + nhwar[i].getWeight());
		}
	}

}

class NHW {
	private String name;
	private int height;
	private double weight;

	NHW(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}

public class Main1 {
	public static void main(String[] args) {
		NHWAr nhw = new NHWAr();
		nhw.nameSort();
		System.out.println("name");
		nhw.print();
		System.out.println();

		nhw.weightSort();
		System.out.println("weight");
		nhw.print();
	}
}