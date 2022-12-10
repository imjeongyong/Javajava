package recursive;

public class q9101 {

	static void callHong(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println("홍길동");
			callHong(n - 1);
		}
	}

	public static void main(String[] args) {
		callHong(10);
	}
}