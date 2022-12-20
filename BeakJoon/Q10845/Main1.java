package Q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String token = st.nextToken();

			switch (token) {
			case "push":
				String token2 = st.nextToken();
				que.add(Integer.parseInt(token2));
				break;

			case "pop":
				if (que.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(que.poll());
				}
				break;

			case "size":
				System.out.println(que.size());
				break;

			case "empty":
				if (que.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;

			case "front":
				if (que.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(que.peek());
				}
				break;

			case "back":
				if (que.isEmpty()) {
					System.out.println(-1);
				} else {
					int back = que.size() - 1;
					System.out.println(((LinkedList<Integer>) que).get(back));
				}
				break;
			}
		}
	}
}