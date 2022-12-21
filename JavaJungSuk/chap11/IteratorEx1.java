package chap11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}