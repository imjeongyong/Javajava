package string1Q187;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new LinkedList<Character>();

		String inp = sc.next();
		for (int i = 0; i < inp.length(); i++) {
			list.add(i, inp.charAt(i));
		}

		while (true) {

			int n = sc.nextInt();
			try {
				list.remove(n-1);
			} catch (Exception e) {
				list.remove(list.size() - 1);
			}

			Iterator<Character> it = list.iterator();
			while (it.hasNext()) {
				System.out.print(it.next());
			}
			System.out.println();

			if (list.size() == 1) {
				break;
			}
		}
		sc.close();
	}
}