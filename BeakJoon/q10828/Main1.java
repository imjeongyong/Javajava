package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> stk = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String token = st.nextToken();

			switch (token) {
			case "push":
				String token2 = st.nextToken();
				stk.push(Integer.parseInt(token2));
				break;
			case "pop":
				if (stk.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stk.pop());
				}
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				if (stk.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				if (stk.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stk.peek());
				}
				break;
			}
		}
	}
}