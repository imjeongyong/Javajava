package chap11;

import java.util.HashSet;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet(); // set은 중복 허용 x

		set.add("abc");
		set.add("abc"); // 중복이니 1개만 삽입
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return (name + age).hashCode();
	}

	public String toString() {
		return name + ":" + age;
	}
}