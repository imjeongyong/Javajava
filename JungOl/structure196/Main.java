package structure196;

import java.util.Scanner;

class StAr {
	private StudInfo[] st;
	Scanner sc = new Scanner(System.in);

	StAr() {
		st = new StudInfo[3];

		for (int i = 0; i < st.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			st[i] = new StudInfo(name, tel, addr);
		}
	}

	void nameSort() {
		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < st.length - 1; j++) {
				if ((int) st[j].getName().charAt(0) > (int) st[j + 1].getName().charAt(0)) {
					StudInfo tmp = st[j];
					st[j] = st[j+1];
					st[j+1] = tmp;
				}
			}
		}
	}

	void print() {
		System.out.println("name : " + st[0].getName());
		System.out.println("tel : " + st[0].getTel());
		System.out.println("addr : " + st[0].getAddr());
	}
}

class StudInfo {
	private String name;
	private String tel;
	private String addr;

	StudInfo(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddr() {
		return addr;
	}
}

public class Main {
	public static void main(String[] args) {
		StAr star = new StAr();
		star.nameSort();
		star.print();
	}
}