package structureq195;

import java.util.Scanner;

class NTA {
	private String name;
	private String tel;
	private String addr;

	NTA(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	void print() {
		System.out.println("name : " + this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("addr : " + this.addr);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();

		NTA nta = new NTA(name, tel, addr);
		nta.print();
	}
}