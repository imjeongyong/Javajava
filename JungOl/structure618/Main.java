package structure618;

import java.util.Scanner;

class StuSort {
	Scanner sc = new Scanner(System.in);
	private StuList[] stulist;

	public StuSort() {
		stulist = new StuList[5];
		for (int i = 0; i < stulist.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			stulist[i] = new StuList(name, height, weight);
		}
	}

	void nameSort() {
		for (int i = 0; i < stulist.length; i++) {
			for (int j = 0; j < stulist.length - 1; j++) {
				int c = "stulist[j].getName.charAt(0)".compareTo("stulist[j+1].getName.charAt(0)");
				if (c < 0) {
					StuList stuTmp = new StuList(stulist[j].getName(), stulist[j].getHeight(), stulist[j].getWeight());
					stulist[j] = new StuList(stulist[j + 1].getName(), stulist[j + 1].getHeight(),
							stulist[j + 1].getWeight());
					stulist[j + 1] = new StuList(stuTmp.getName(), stuTmp.getHeight(), stuTmp.getWeight());
				}
			}
		}
		System.out.println("name");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%S %d %.1f\n", stulist[i].getName(), stulist[i].getHeight(), stulist[i].getWeight());
		}
	}
}

class StuList {
	private String name;
	private int height;
	private double weight;

	StuList(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	String getName() {
		return name;
	}

	int getHeight() {
		return height;
	}

	double getWeight() {
		return weight;
	}

}

public class Main {
	public static void main(String[] args) {

		StuSort ss = new StuSort();
		ss.nameSort();

	}
}