package q617;

import java.util.Scanner;

class ShortMan {
	private String name;
	private int height;

	ShortMan(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public String getName(int height) {
		return name;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShortMan[] sm = new ShortMan[5];
		for (int i = 0; i < sm.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			sm[i] = new ShortMan(name, height);
		}
		sc.close();

		for (int i = 0; i < sm.length; i++) {
			for (int j = 0; j < sm.length - 1; j++) {
				if (sm[j].getHeight() > sm[j + 1].getHeight()) {
					int tmp = sm[j].getHeight();
					String stmp = sm[j].getName();
					sm[j].setHeight(sm[j + 1].getHeight());
					sm[j].setName(sm[j + 1].getName());
					sm[j + 1].setHeight(tmp);
					sm[j + 1].setName(stmp);
				}
			}
		}
		System.out.println(sm[0].getName() + " " + sm[0].getHeight());
	}
}
