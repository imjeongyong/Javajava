package Q9012;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main { // 괄호문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String inp = sc.next();

			try {
				stk.clear();
				for (int j = 0; j < inp.length(); j++) {
					if (inp.charAt(j) == '(') {
						stk.push(inp.charAt(j));
					} else if (inp.charAt(j) == ')') {
						stk.pop();
					}
				}

				if (stk.isEmpty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}

			} catch (EmptyStackException e) {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}